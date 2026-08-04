package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.FeatureRendererMap.class)
public class FeatureRendererMap_1869594567Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/client/renderer/feature/FeatureRendererType;)Lnet/minecraft/client/renderer/feature/FeatureRenderer;", cancellable = true)
    private void get_932777343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932777343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/renderer/feature/FeatureRendererType;Lnet/minecraft/client/renderer/feature/FeatureRenderer;)V", cancellable = true)
    private void put__1745575565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1745575565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/lang/Iterable;", cancellable = true)
    private void values__140155122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-140155122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1907869305(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1907869305L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOrThrow(Lnet/minecraft/client/renderer/feature/FeatureRendererType;)Lnet/minecraft/client/renderer/feature/FeatureRenderer;", cancellable = true)
    private void getOrThrow_932777343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932777343L))
            info.setReturnValue(null);
    }


}
