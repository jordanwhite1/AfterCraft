package core;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = core.lib.Reference.MOD_ID, name = core.lib.Reference.MOD_NAME, version = core.lib.Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Base
{
      
       @Init
       public void load(FMLInitializationEvent event)
       {
           //Initializing Mod blocks
           blocks.ModBlocks.init();

       }
}