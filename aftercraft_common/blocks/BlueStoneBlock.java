package blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlueStoneBlock extends Block {
    
    

    public BlueStoneBlock(int id, Material par2Material) {
        super(id, par2Material);
       this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
 {
     this.blockIcon = par1IconRegister.registerIcon(core.lib.Reference.MOD_ID + ":" + this.getUnlocalizedName2());
 }

}
