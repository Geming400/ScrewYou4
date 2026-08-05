package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.phase.TranslucentFeatureRenderPhase.class)
public class TranslucentFeatureRenderPhase108291418Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_146570001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146570001L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/feature/submit/TranslucentSubmit;)V", cancellable = true)
    private void submit__227300723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-227300723L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/feature/submit/SubmitNode;)V", cancellable = true)
    private void submit__1737573368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1737573368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sortInto(Lnet/minecraft/client/renderer/feature/phase/FeatureRenderPhase$Output;)V", cancellable = true)
    private void sortInto__1590470441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1590470441L))
            info.cancel();
    }


}
