package net.max.projectx.event;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;



public class AxeRequirementHandler implements PlayerBlockBreakEvents.Before {
    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, BlockEntity blockEntity) {
        Item heldItem = player.getMainHandStack().getItem();
        if (state.getMaterial() == Material.WOOD && !world.isClient && heldItem instanceof AxeItem) {
            player.sendMessage(Text.literal(player.getName().getString() + " broke wooden block with an axe!"));
            // Allow the block break event to continue
            return true;
        }
        // Allow the block break event to continue if not wood
        else if (state.getMaterial() != Material.WOOD && !world.isClient) {
            return true;
        }
        // Cancel the block break event
        player.sendMessage(Text.literal(player.getName().getString() + " cannot break this block! "));
        return false;
    }
}