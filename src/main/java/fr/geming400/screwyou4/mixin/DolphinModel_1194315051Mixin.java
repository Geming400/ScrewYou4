package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.dolphin.DolphinModel.class)
public class DolphinModel_1194315051Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1715015367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1715015367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/DolphinRenderState;)V", cancellable = true)
    private void setupAnim__753873815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-753873815L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_480182886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480182886L))
            info.setReturnValue(null);
    }


}
