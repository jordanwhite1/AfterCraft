package jordanwhite1.aftercraft.block;

import jordanwhite1.aftercraft.tileentity.TileEntityLogicCircuit;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;



//import com.pahimar.ee3.lib.BlockIds;
//import com.pahimar.ee3.lib.Strings;



public class ModBlocks {
    
    public final static int BLOCK_ID = 1000;
    public final static Block LogicCircuit = new BlockLogicCircuit(BLOCK_ID);

    public static void init() {

        GameRegistry.registerBlock(LogicCircuit, "blockLogicCircuit");
        GameRegistry.registerTileEntity(TileEntityLogicCircuit.class, "tileEntityLogicCircuit");
        
        LanguageRegistry.addName(LogicCircuit, "Logic Circuit");
        
        initBlockRecipes();

    }
    
    private static void initBlockRecipes() {


    }
}
