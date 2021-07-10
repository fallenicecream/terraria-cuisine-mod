package fallenicecream.tcuisine.item.food;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Fries extends Item {
    public Fries() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(6.4f).build()).maxCount(64).rarity(Rarity.COMMON));
    }
}
