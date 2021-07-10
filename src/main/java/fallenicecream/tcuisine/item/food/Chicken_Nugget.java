package fallenicecream.tcuisine.item.food;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Chicken_Nugget extends Item {
    public Chicken_Nugget() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(2.4f).meat().build()).maxCount(64).rarity(Rarity.COMMON));
    }
}
