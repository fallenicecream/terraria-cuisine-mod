package fallenicecream.tcuisine.item.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Golden_Delight extends Item {
    public Golden_Delight() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(12).saturationModifier(15.2f).meat()
                .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*60*2, 3), 1f)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*60*3, 0), 1f)
                .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20*60*3, 4), 1f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*60*3, 1), 1f)
                .alwaysEdible().build()).maxCount(1).rarity(Rarity.RARE));
    }
}
