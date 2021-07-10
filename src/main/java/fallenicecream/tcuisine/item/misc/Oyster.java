package fallenicecream.tcuisine.item.misc;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Oyster extends Item {
    public Oyster() {
        super(new Settings().group(ItemGroup.MISC).maxCount(64).rarity(Rarity.COMMON));
    }
}
