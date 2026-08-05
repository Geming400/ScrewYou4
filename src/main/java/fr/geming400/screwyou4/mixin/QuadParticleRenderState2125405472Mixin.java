package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.QuadParticleRenderState.class)
public class QuadParticleRenderState2125405472Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1339577766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1339577766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1110445452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110445452L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/particle/SingleQuadParticle$Layer;FFFFFFFFFFFFII)V", cancellable = true)
    private void add_1466293702(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1466293702L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "layers()Ljava/util/Set;", cancellable = true)
    private void layers_547786432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547786432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1818987647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1818987647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "buildLayer(Lnet/minecraft/client/particle/SingleQuadParticle$Layer;Lcom/mojang/blaze3d/vertex/VertexConsumer;)V", cancellable = true)
    private void buildLayer_335563001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(335563001L))
            info.cancel();
    }


}
