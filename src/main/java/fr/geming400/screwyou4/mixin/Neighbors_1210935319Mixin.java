package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SideChainPartBlock.Neighbors.class)
public class Neighbors_1210935319Mixin {
        @Inject(at = @At("HEAD"), method = "cache()Ljava/util/Map;", cancellable = true)
    private void cache__793688322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793688322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1698519719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698519719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_75475343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75475343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1249198060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249198060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/SideChainPartBlock;", cancellable = true)
    private void block__792200202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-792200202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left(I)Lnet/minecraft/world/level/block/SideChainPartBlock$Neighbor;", cancellable = true)
    private void left__1490003445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1490003445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "left()Lnet/minecraft/world/level/block/SideChainPartBlock$Neighbor;", cancellable = true)
    private void left_169123090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169123090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right(I)Lnet/minecraft/world/level/block/SideChainPartBlock$Neighbor;", cancellable = true)
    private void right__1490003445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1490003445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "right()Lnet/minecraft/world/level/block/SideChainPartBlock$Neighbor;", cancellable = true)
    private void right_169123090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169123090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/LevelAccessor;", cancellable = true)
    private void level_536530475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536530475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void center__682451561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-682451561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "facing()Lnet/minecraft/core/Direction;", cancellable = true)
    private void facing_448080033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448080033L))
            info.setReturnValue(null);
    }


}
