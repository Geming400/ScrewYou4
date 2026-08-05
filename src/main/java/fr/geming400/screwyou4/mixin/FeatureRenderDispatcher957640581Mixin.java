package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.FeatureRenderDispatcher.class)
public class FeatureRenderDispatcher957640581Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1156934848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1156934848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderAllFeatures(Lnet/minecraft/client/renderer/SubmitNodeStorage;)V", cancellable = true)
    private void renderAllFeatures__662650190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-662650190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareFrame(Lnet/minecraft/client/renderer/SubmitNodeStorage;)Lnet/minecraft/client/renderer/feature/FeatureRenderDispatcher$PreparedFrame;", cancellable = true)
    private void prepareFrame__900137033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900137033L))
            info.setReturnValue(null);
    }


}
