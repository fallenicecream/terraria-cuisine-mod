package fallenicecream.tcuisine.item.brewing;

import fallenicecream.tcuisine.item.DrinkItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Rarity;

public class Eggnog extends DrinkItem {
    public Eggnog() {
        super(new Item.Settings().group(ItemGroup.BREWING).food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 0), 1f).build()).maxCount(16).rarity(Rarity.UNCOMMON));
    }

    @Override
    public boolean isReturnBottle() {
        return false;
    }
    @Override
    public SoundEvent getDrinkSound() {
        return SoundEvents.ITEM_HONEY_BOTTLE_DRINK;
    }
}
