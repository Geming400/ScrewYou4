package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.phase.SimpleFeatureRenderPhase.class)
public class SimpleFeatureRenderPhase1504484317Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_718656611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(718656611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1731366607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731366607L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/feature/submit/SubmitNode;)V", cancellable = true)
    private void submit__1811570461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1811570461L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sortInto(Lnet/minecraft/client/renderer/feature/phase/FeatureRenderPhase$Output;)V", cancellable = true)
    private void sortInto_2028843896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2028843896L))
            info.cancel();
    }


}
