package fallenicecream.tcuisine.item.brewing;

import fallenicecream.tcuisine.item.DrinkItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Sake extends DrinkItem {
    public Sake() {
        super(new Item.Settings().group(ItemGroup.BREWING).food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*8, 15), 0.65f).build()).maxCount(16).rarity(Rarity.COMMON));
    }

    @Override
    public boolean isReturnBottle() {
        return false;
    }
}
