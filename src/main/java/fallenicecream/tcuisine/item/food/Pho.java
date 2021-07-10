package fallenicecream.tcuisine.item.food;

import fallenicecream.tcuisine.item.BowlItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Pho extends BowlItem {
    public Pho() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(9.6f).build()).maxCount(1).rarity(Rarity.COMMON));
    }

    @Override
    public boolean isReturnBowl() {
        return false;
    }
}
