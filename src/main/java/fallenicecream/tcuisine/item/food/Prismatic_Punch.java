package fallenicecream.tcuisine.item.food;

import fallenicecream.tcuisine.item.DrinkItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class Prismatic_Punch extends DrinkItem {
    public Prismatic_Punch() {
        super(new Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(3.6f)
                .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 20*10, 0), 1f).build()).maxCount(16).rarity(Rarity.COMMON));
    }

    @Override
    public boolean isReturnBottle() {
        return true;
    }

}
