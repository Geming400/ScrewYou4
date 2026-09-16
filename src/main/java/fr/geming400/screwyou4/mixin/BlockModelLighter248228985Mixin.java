package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BlockModelLighter.class)
public class BlockModelLighter248228985Mixin {
        @Inject(at = @At("HEAD"), method = "clearCache()V", cancellable = true)
    private static void clearCache__546030577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-546030577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getLightCoords__1510174783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1510174783L))
            info.setReturnValue(-735671707);
    }

    @Inject(at = @At("HEAD"), method = "prepareQuadAmbientOcclusion(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/client/resources/model/geometry/BakedQuad;Lcom/mojang/blaze3d/vertex/QuadInstance;)V", cancellable = true)
    private void prepareQuadAmbientOcclusion_2106901786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2106901786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareQuadFlat(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;ILnet/minecraft/client/resources/model/geometry/BakedQuad;Lcom/mojang/blaze3d/vertex/QuadInstance;)V", cancellable = true)
    private void prepareQuadFlat_640546195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(640546195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enableCaching()V", cancellable = true)
    private static void enableCaching__1316254488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1316254488L))
            info.cancel();
    }


}
