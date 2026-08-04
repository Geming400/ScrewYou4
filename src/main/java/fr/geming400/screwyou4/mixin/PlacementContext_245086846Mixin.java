package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.PlacementContext.class)
public class PlacementContext_245086846Mixin {
        @Inject(at = @At("HEAD"), method = "generator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void generator__1551905561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551905561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/WorldGenLevel;", cancellable = true)
    private void getLevel__1700083497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1700083497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_643712791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643712791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_283349091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(283349091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/levelgen/Heightmap$Types;II)I", cancellable = true)
    private void getHeight_1040673871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040673871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "topFeature()Ljava/util/Optional;", cancellable = true)
    private void topFeature_490548267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490548267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCarvingMask(Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/world/level/chunk/CarvingMask;", cancellable = true)
    private void getCarvingMask__700888417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-700888417L))
            info.setReturnValue(null);
    }


}
