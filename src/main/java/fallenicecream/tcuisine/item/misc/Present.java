package fallenicecream.tcuisine.item.misc;

import fallenicecream.tcuisine.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class Present extends Item {

    public Present() {
        super(new Settings().group(ItemGroup.MISC).maxCount(64).rarity(Rarity.COMMON));
    }

    protected void dropLoot(PlayerEntity playerEntity) {
        Random random = new Random();
        float f = random.nextFloat();
        ItemStack itemStack;
        if (f < 0.1f) { // Christmas Pudding
            itemStack = new ItemStack(ModItems.CHRISTMAS_PUDDING);
        } else if (f < 0.3f) { // Eggnog
            itemStack = new ItemStack(ModItems.EGGNOG);
        } else if (f < 0.4f) { // Experience Bottle
            itemStack = new ItemStack(Items.EXPERIENCE_BOTTLE);
        } else if (f < 0.8) { // Gingerbread Cookie & Sugar Cookie
            itemStack = random.nextBoolean() ? new ItemStack(ModItems.GINGERBREAD_COOKIE) : new ItemStack(ModItems.SUGAR_COOKIE);
        } else { // Coal & Charcoal
            itemStack = random.nextBoolean() ? new ItemStack(Items.COAL) : new ItemStack(Items.CHARCOAL);
        }
        playerEntity.dropItem(itemStack, true);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 16;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.setCurrentHand(hand);
        playerEntity.playSound(SoundEvents.BLOCK_COMPOSTER_READY, 1.0F, 1.0F);
        if (!(playerEntity.getAbilities().creativeMode)) {
            playerEntity.getInventory().getMainHandStack().decrement(1);
        }
        dropLoot(playerEntity);
        return TypedActionResult.consume(playerEntity.getInventory().getMainHandStack());
    }
}
