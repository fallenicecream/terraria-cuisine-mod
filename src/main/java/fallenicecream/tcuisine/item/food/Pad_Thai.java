package fallenicecream.tcuisine.item.food;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Pad_Thai extends Item {
    public Pad_Thai() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(12.8f).build()).maxCount(64).rarity(Rarity.COMMON));
    }
}
