package fallenicecream.tcuisine.item;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.Objects;
import java.util.Random;

public abstract class DrinkItem extends Item {

    public DrinkItem(Settings settings) {
        super(settings);
    }

    public abstract boolean isReturnBottle();

    private static void applyStatusEffect(PlayerEntity playerEntity, ItemStack stack) {
        Random random = new Random();

        if (!Objects.requireNonNull(stack.getItem().getFoodComponent()).getStatusEffects().isEmpty()) {
            for (int i = 0; i < stack.getItem().getFoodComponent().getStatusEffects().size(); i++) {
                if (random.nextFloat() < stack.getItem().getFoodComponent().getStatusEffects().get(i).getSecond()) {
                    playerEntity.addStatusEffect(new StatusEffectInstance(stack.getItem().getFoodComponent().getStatusEffects().get(i).getFirst()));
                }
            }
        }
    }

    private static void eat(PlayerEntity playerEntity, ItemStack stack) {
        playerEntity.getHungerManager().eat(stack.getItem(), stack);
        playerEntity.incrementStat(Stats.USED.getOrCreateStat(stack.getItem()));
        if (playerEntity instanceof ServerPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity)playerEntity, stack);
        }
        applyStatusEffect(playerEntity, stack);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerEntity = user instanceof PlayerEntity ? (PlayerEntity) user : null;

        assert playerEntity != null;
        if (!playerEntity.getAbilities().creativeMode) {
            if (isReturnBottle()) {
                if (stack.getCount() == 1) {
                    eat(playerEntity, stack);
                    playerEntity.getInventory().setStack(playerEntity.getInventory().selectedSlot, new ItemStack(Items.GLASS_BOTTLE));
                    return stack;
                } else if (stack.getCount() > 1) {
                    if (playerEntity.getInventory().getOccupiedSlotWithRoomForStack(new ItemStack(Items.GLASS_BOTTLE)) > -1) { // find a slot with a glass bottle and add a glass bottle there
                        playerEntity.getInventory().insertStack(playerEntity.getInventory().getOccupiedSlotWithRoomForStack(new ItemStack(Items.GLASS_BOTTLE)), new ItemStack(Items.GLASS_BOTTLE));
                    } else if (playerEntity.getInventory().getEmptySlot() > -1) { // find an empty slot and add a glass bottle there
                        playerEntity.getInventory().insertStack(playerEntity.getInventory().getEmptySlot(), new ItemStack(Items.GLASS_BOTTLE));
                    } else { // if there are no empty slots drop glass bottle
                        playerEntity.dropItem(new ItemStack(Items.GLASS_BOTTLE), true);
                    }
                    eat(playerEntity, stack);
                    stack.decrement(1);
                    return stack;
                } else {
                    eat(playerEntity, stack);
                    stack.decrement(1);
                    return stack;
                }
            } else {
                eat(playerEntity, stack);
                stack.decrement(1);
                return stack;
            }
        }
        eat(playerEntity, stack);
        return stack;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) { return UseAction.DRINK; }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setCurrentHand(hand);
        return new TypedActionResult<>(ActionResult.SUCCESS, user.getStackInHand(hand));
    }
}