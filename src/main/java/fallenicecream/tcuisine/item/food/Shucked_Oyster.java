package fallenicecream.tcuisine.item.food;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Shucked_Oyster extends Item {
    public Shucked_Oyster() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.6f).build()).maxCount(64).rarity(Rarity.COMMON));
    }
}
