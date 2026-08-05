package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.llama.LlamaModel.class)
public class LlamaModel_1888121552Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1021208866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1021208866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LlamaRenderState;)V", cancellable = true)
    private void setupAnim__208970779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-208970779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__900613443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900613443L))
            info.setReturnValue(null);
    }


}
