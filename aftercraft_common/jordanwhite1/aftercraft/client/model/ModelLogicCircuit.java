package jordanwhite1.aftercraft.client.model;

import jordanwhite1.aftercraft.tileentity.TileEntityLogicCircuit;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelLogicCircuit extends ModelBase
{
	private IModelCustom modelTutBox;
	
	public ModelLogicCircuit()
	{
		modelTutBox = AdvancedModelLoader.loadModel("/models/tutBox.obj");
	}
	
	public void render()
	{
		modelTutBox.renderAll();
	}
	
	public void render(TileEntityLogicCircuit box, double x, double y, double z)
	{
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float)x + 0.5f, (float)y + 0.5f, (float)z + 0.5f);
		
		// Scale our object to about half-size in all directions (the OBJ file is a little large)
		GL11.glScalef(0.5f, 0.5f, 0.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture("/texture/model/TutBox.png");

		// Render the object, using modelTutBox.renderAll();
		this.render();

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}
