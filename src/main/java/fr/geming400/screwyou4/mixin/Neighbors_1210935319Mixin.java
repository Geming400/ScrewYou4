package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SideChainPartBlock.Neighbors.class)
public class Neighbors_1210935319Mixin {
        @Inject(at = @At("HEAD"), method = "cache()Ljava/util/Map;", cancellable = true)
    private void cache__389344196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-389344196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_302309050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302309050L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1981358843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981358843L))
            info.setReturnValue("p)h\u3B57\u57DAGt{\uB473");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1768287409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768287409L))
            info.setReturnValue(1744647483);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/SideChainPartBlock;", cancellable = true)
    private void block_785167747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785167747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left(I)Lnet/minecraft/world/level/block/SideChainPartBlock$Neighbor;", cancellable = true)
    private void left__1031447470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1031447470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left()Lnet/minecraft/world/level/block/SideChainPartBlock$Neighbor;", cancellable = true)
    private void left_1015199211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1015199211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right(I)Lnet/minecraft/world/level/block/SideChainPartBlock$Neighbor;", cancellable = true)
    private void right_1557734695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557734695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right()Lnet/minecraft/world/level/block/SideChainPartBlock$Neighbor;", cancellable = true)
    private void right__1395130762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395130762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/LevelAccessor;", cancellable = true)
    private void level_534649127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534649127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void center__491425822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491425822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "facing()Lnet/minecraft/core/Direction;", cancellable = true)
    private void facing_19431931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19431931L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }


}
