package fallenicecream.tcuisine.item.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Christmas_Pudding extends Item {
    public Christmas_Pudding() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.4f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*60*3, 1), 1f)
                .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20*60*3, 1), 1f)
                .build()).maxCount(64).rarity(Rarity.RARE));
    }
}
