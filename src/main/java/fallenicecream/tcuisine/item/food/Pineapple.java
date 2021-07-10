package fallenicecream.tcuisine.item.food;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Pineapple extends Item {
    public Pineapple() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(2.8f).build()).maxCount(64).rarity(Rarity.COMMON));
    }
}
