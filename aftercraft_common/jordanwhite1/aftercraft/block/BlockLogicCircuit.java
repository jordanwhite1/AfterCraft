package jordanwhite1.aftercraft.block;

import jordanwhite1.aftercraft.tileentity.TileEntityLogicCircuit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockLogicCircuit extends Block
{
	public BlockLogicCircuit(int id)
	{
		super(id, Material.rock);
		
		setUnlocalizedName("blockTutBox");
		setHardness(5f);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public boolean hasTileEntity(int metadata)
	{
		return true;
	}
	
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer playerEntity, int par6, float par7, float par8, float par9)
	{
		if(playerEntity.isSneaking())
			return false;
		
		playerEntity.setEntityHealth(0);
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		return new TileEntityLogicCircuit();
	}
	
	@Override
	public int getRenderType()
	{
		return -1;
	}
}
