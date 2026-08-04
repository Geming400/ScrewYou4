package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.sniffer.SnifferModel.class)
public class SnifferModel804454462Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_90322298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90322298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2104875955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2104875955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SnifferRenderState;)V", cancellable = true)
    private void setupAnim__249287814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-249287814L))
            info.cancel();
    }


}
