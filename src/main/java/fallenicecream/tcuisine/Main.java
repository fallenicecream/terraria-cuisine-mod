package fallenicecream.tcuisine;

import fallenicecream.tcuisine.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
    private static final Logger logger = LogManager.getLogger("TerrariaFoods");

    @Override
    public void onInitialize() {
        try {
            ModItems.registerItems();
            ModItems.registerCompostableItems();
            System.out.println("help me!!!");
            logger.info("Terraria Foods Mod successfully loaded");
        }
        catch (Exception e) {
            logger.fatal("Failed to load Terraria Foods Mod");
        }
    }
}
