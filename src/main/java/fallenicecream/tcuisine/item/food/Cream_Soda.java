package fallenicecream.tcuisine.item.food;

import fallenicecream.tcuisine.item.DrinkItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Cream_Soda extends DrinkItem {
    public Cream_Soda() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.6f).alwaysEdible().build()).maxCount(16).rarity(Rarity.UNCOMMON));
    }

    @Override
    public boolean isReturnBottle() {
        return false;
    }
}
