package fallenicecream.tcuisine.item.misc;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Lobster extends Item {
    public Lobster() {
        super(new Settings().group(ItemGroup.MISC).maxCount(64).rarity(Rarity.COMMON));
    }
}
