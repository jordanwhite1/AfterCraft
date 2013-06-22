package jordanwhite1.aftercraft.core.proxy;

import jordanwhite1.aftercraft.client.renderer.item.ItemLogicCircuitRenderer;
import jordanwhite1.aftercraft.client.renderer.tileentity.TileEntityLogicCircuitRenderer;
import jordanwhite1.aftercraft.lib.BlockIds;
import jordanwhite1.aftercraft.tileentity.TileEntityLogicCircuit;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void InitRendering()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLogicCircuit.class, new TileEntityLogicCircuitRenderer());	
		MinecraftForgeClient.registerItemRenderer(BlockIds.LOGICCIRCUIT, new ItemLogicCircuitRenderer());
	}
}
