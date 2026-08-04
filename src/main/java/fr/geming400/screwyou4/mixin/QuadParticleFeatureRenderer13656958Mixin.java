package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.QuadParticleFeatureRenderer.class)
public class QuadParticleFeatureRenderer13656958Mixin {
        @Inject(at = @At("HEAD"), method = "executeGroup(Lnet/minecraft/client/renderer/feature/FeatureFrameContext;ILjava/util/List;Z)V", cancellable = true)
    private void executeGroup__1828803867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1828803867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finishExecute(Lnet/minecraft/client/renderer/feature/FeatureFrameContext;)V", cancellable = true)
    private void finishExecute__562975803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-562975803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finishPrepare(Lnet/minecraft/client/renderer/feature/FeatureFrameContext;)V", cancellable = true)
    private void finishPrepare__562975803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-562975803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareGroup(Lnet/minecraft/client/renderer/feature/FeatureFrameContext;Ljava/util/List;Z)V", cancellable = true)
    private void prepareGroup_874364566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(874364566L))
            info.cancel();
    }


}
