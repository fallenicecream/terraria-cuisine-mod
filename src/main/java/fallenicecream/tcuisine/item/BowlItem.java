package fallenicecream.tcuisine.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public abstract class BowlItem extends Item {

    public BowlItem(Settings settings) {
        super(settings);
    }

    public abstract boolean isReturnBowl();

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerEntity = user instanceof PlayerEntity ? (PlayerEntity) user : null;

        assert playerEntity != null;
        if (!playerEntity.getAbilities().creativeMode) {
            if (isReturnBowl()) {
                playerEntity.getInventory().setStack(playerEntity.getInventory().selectedSlot, new ItemStack(Items.BOWL));
            }
        }
        return this.isFood() ? user.eatFood(world, stack) : stack;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) { return UseAction.EAT; }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.canConsume(this.getFoodComponent().isAlwaysEdible())) {
            user.setCurrentHand(hand);
            return new TypedActionResult<>(ActionResult.SUCCESS, user.getStackInHand(hand));
        }
        return TypedActionResult.fail(user.getStackInHand(hand));
    }
}