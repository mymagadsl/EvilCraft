package evilcraft.api.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlockMetadata extends ItemBlockWithMetadata{
    
    protected InformationProviderComponent informationProvider;

    public ItemBlockMetadata(int metaData, Block block) {
        super(metaData, block);
        informationProvider = new InformationProviderComponent(block);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean par4) {
        informationProvider.addInformation(itemStack, entityPlayer, list, par4);
    }

}
