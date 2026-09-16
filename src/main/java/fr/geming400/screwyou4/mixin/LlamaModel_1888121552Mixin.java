package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.llama.LlamaModel.class)
public class LlamaModel_1888121552Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1723197200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1723197200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LlamaRenderState;)V", cancellable = true)
    private void setupAnim__1769667949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1769667949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_270444784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270444784L))
            info.setReturnValue(null);
    }


}
