package fallenicecream.tcuisine.item.food;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Plum extends Item {
    public Plum() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.6f).build()));
    }
}
