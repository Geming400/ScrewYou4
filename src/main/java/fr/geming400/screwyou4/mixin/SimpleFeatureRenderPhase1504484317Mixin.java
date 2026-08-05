package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.phase.SimpleFeatureRenderPhase.class)
public class SimpleFeatureRenderPhase1504484317Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1542759056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1542759056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1542762900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542762900L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/feature/submit/SubmitNode;)V", cancellable = true)
    private void submit__341509429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-341509429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sortInto(Lnet/minecraft/client/renderer/feature/phase/FeatureRenderPhase$Output;)V", cancellable = true)
    private void sortInto__194277542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-194277542L))
            info.cancel();
    }


}
