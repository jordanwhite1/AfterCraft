package jordanwhite1.aftercraft.client.renderer.tileentity;

import jordanwhite1.aftercraft.client.model.ModelLogicCircuit;
import jordanwhite1.aftercraft.tileentity.TileEntityLogicCircuit;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityLogicCircuitRenderer extends TileEntitySpecialRenderer
{
	private ModelLogicCircuit modelLogicCircuit = new ModelLogicCircuit();
	
	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick)
	{
		modelLogicCircuit.render((TileEntityLogicCircuit)tileEntity, x, y, z);
	}
}
