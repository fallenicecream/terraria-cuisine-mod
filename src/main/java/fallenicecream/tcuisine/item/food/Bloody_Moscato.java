package fallenicecream.tcuisine.item.food;

import fallenicecream.tcuisine.item.DrinkItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Bloody_Moscato extends DrinkItem {
    public Bloody_Moscato() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(2.8f).build()).maxCount(16).rarity(Rarity.COMMON));
    }

    @Override
    public boolean isReturnBottle() {
        return true;
    }
}