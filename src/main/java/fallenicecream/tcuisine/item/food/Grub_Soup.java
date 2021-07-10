package fallenicecream.tcuisine.item.food;

import fallenicecream.tcuisine.item.BowlItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Grub_Soup extends BowlItem {
    public Grub_Soup() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(7.2f).build()).maxCount(1).rarity(Rarity.COMMON));
    }

    @Override
    public boolean isReturnBowl() {
        return true;
    }
}
