package fallenicecream.tcuisine.item.food;

import fallenicecream.tcuisine.item.BowlItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Banana_Split extends BowlItem {
    public Banana_Split() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(7.2f).build()).maxCount(64).rarity(Rarity.UNCOMMON));
    }

    @Override
    public boolean isReturnBowl() {
        return false;
    }
}
