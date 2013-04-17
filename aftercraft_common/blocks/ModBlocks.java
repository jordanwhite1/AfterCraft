package blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


/**
 * AfterCraft
 * 
 * ModBlocks
 * 
 * @author JordanWhite
 * 
 * 
 */
public class ModBlocks {

    public static final String modid = core.lib.Reference.MOD_NAME;
    /* Mod block instances */
    public static Block BlueStoneBlock;

    public static void init() {

        BlueStoneBlock = new BlueStoneBlock(500, Material.rock).setUnlocalizedName("BlueStone Block");
        GameRegistry.registerBlock(BlueStoneBlock, modid + BlueStoneBlock.getUnlocalizedName2());
        LanguageRegistry.addName(BlueStoneBlock, "BlueStoneBlock");

    }


}
