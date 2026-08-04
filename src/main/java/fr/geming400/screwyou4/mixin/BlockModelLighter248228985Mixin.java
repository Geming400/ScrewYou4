package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BlockModelLighter.class)
public class BlockModelLighter248228985Mixin {
        @Inject(at = @At("HEAD"), method = "clearCache()V", cancellable = true)
    private static void clearCache_286503972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(286503972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getLightCoords__1896412893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1896412893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enableCaching()V", cancellable = true)
    private static void enableCaching_286503972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(286503972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareQuadFlat(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;ILnet/minecraft/client/resources/model/geometry/BakedQuad;Lcom/mojang/blaze3d/vertex/QuadInstance;)V", cancellable = true)
    private void prepareQuadFlat_492641868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(492641868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareQuadAmbientOcclusion(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/client/resources/model/geometry/BakedQuad;Lcom/mojang/blaze3d/vertex/QuadInstance;)V", cancellable = true)
    private void prepareQuadAmbientOcclusion_1996051741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1996051741L))
            info.cancel();
    }


}
