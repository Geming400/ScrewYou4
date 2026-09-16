package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.QuadParticleFeatureRenderer.class)
public class QuadParticleFeatureRenderer13656958Mixin {
        @Inject(at = @At("HEAD"), method = "prepareGroup(Lnet/minecraft/client/renderer/feature/FeatureFrameContext;Ljava/util/List;Z)V", cancellable = true)
    private void prepareGroup_304783326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(304783326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "executeGroup(Lnet/minecraft/client/renderer/feature/FeatureFrameContext;ILjava/util/List;Z)V", cancellable = true)
    private void executeGroup_201825391(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(201825391L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finishPrepare(Lnet/minecraft/client/renderer/feature/FeatureFrameContext;)V", cancellable = true)
    private void finishPrepare__486774599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-486774599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finishExecute(Lnet/minecraft/client/renderer/feature/FeatureFrameContext;)V", cancellable = true)
    private void finishExecute__2092637401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2092637401L))
            info.cancel();
    }


}
