package fallenicecream.tcuisine.item.food;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Potato_Chips extends Item {

    public Potato_Chips() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(6f).build()).maxCount(64).rarity(Rarity.COMMON));
    }
}
