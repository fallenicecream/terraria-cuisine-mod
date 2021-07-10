package fallenicecream.tcuisine.item.food;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Pizza extends Item {
    public Pizza() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(9.6f).build()).maxCount(64).rarity(Rarity.COMMON));
    }
}
