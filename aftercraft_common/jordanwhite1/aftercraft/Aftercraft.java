package jordanwhite1.aftercraft;

import jordanwhite1.aftercraft.block.ModBlocks;
import jordanwhite1.aftercraft.core.proxy.CommonProxy;
import jordanwhite1.aftercraft.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Aftercraft
{
    @Instance("objtutorial")
    public static Aftercraft Instance;  
    @SidedProxy(clientSide = "jordanwhite1.aftercraft.core.proxy.ClientProxy", serverSide = "jordanwhite1.aftercraft.core.proxy.CommonProxy")
    public static CommonProxy Proxy;
    
    
    @PreInit
    public void PreInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        Proxy.InitRendering();
    }
    
    @Init
    public void Init(FMLInitializationEvent event)
    {

    }
}
