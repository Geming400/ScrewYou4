package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.phase.TranslucentFeatureRenderPhase.class)
public class TranslucentFeatureRenderPhase108291418Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1167407790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1167407790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/feature/submit/TranslucentSubmit;)V", cancellable = true)
    private void submit__565675659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-565675659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/feature/submit/SubmitNode;)V", cancellable = true)
    private void submit_1087332896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1087332896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sortInto(Lnet/minecraft/client/renderer/feature/phase/FeatureRenderPhase$Output;)V", cancellable = true)
    private void sortInto_632650997(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(632650997L))
            info.cancel();
    }


}
