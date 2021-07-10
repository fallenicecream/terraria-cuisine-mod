package fallenicecream.tcuisine.item.food;

import fallenicecream.tcuisine.item.DrinkItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Fruit_Juice extends DrinkItem {
    public Fruit_Juice() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(3.6f).build()).maxCount(16).rarity(Rarity.COMMON));
    }

    @Override
    public boolean isReturnBottle() {
        return true;
    }
}
