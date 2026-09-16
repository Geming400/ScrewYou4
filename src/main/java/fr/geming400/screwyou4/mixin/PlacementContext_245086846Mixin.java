package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.PlacementContext.class)
public class PlacementContext_245086846Mixin {
        @Inject(at = @At("HEAD"), method = "generator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void generator__238963654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-238963654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/WorldGenLevel;", cancellable = true)
    private void getLevel__378200631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378200631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_530346438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530346438L))
            info.setReturnValue(589193124);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_1784969437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784969437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "topFeature()Ljava/util/Optional;", cancellable = true)
    private void topFeature__487722740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-487722740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCarvingMask(Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/world/level/chunk/CarvingMask;", cancellable = true)
    private void getCarvingMask_954784009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954784009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/levelgen/Heightmap$Types;II)I", cancellable = true)
    private void getHeight__1111145966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1111145966L))
            info.setReturnValue(-1217451931);
    }


}
