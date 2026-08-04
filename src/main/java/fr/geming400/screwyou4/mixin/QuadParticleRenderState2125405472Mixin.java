package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.QuadParticleRenderState.class)
public class QuadParticleRenderState2125405472Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__2131287085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2131287085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__2131283241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131283241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/particle/SingleQuadParticle$Layer;FFFFFFFFFFFFII)V", cancellable = true)
    private void add__1137783545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1137783545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "layers()Ljava/util/Set;", cancellable = true)
    private void layers_296369986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296369986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__786426727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-786426727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "buildLayer(Lnet/minecraft/client/particle/SingleQuadParticle$Layer;Lcom/mojang/blaze3d/vertex/VertexConsumer;)V", cancellable = true)
    private void buildLayer__1840070180(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1840070180L))
            info.cancel();
    }


}
