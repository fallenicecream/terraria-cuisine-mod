package fallenicecream.tcuisine.item.food;

import fallenicecream.tcuisine.item.BowlItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Fruit_Salad extends BowlItem {
    public Fruit_Salad() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build()).maxCount(1).rarity(Rarity.COMMON));
    }

    @Override
    public boolean isReturnBowl() {
        return true;
    }
}
