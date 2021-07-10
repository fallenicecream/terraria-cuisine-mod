package fallenicecream.tcuisine.item.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Shrimp extends Item {

    public Shrimp() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER), 0.8f).build()).maxCount(64).rarity(Rarity.COMMON));
    }
}
