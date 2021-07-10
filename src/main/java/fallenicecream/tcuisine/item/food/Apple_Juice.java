package fallenicecream.tcuisine.item.food;

import fallenicecream.tcuisine.item.DrinkItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Apple_Juice extends DrinkItem {
    public Apple_Juice() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(2.4f).build()).maxCount(16).rarity(Rarity.COMMON));
    }

    @Override
    public boolean isReturnBottle() {
        return true;
    }
}
