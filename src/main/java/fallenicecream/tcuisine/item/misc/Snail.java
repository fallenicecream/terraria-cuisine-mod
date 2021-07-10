package fallenicecream.tcuisine.item.misc;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Snail extends Item {
    public Snail() {
        super(new Settings().group(ItemGroup.MISC).maxCount(64).rarity(Rarity.COMMON));
    }
}
