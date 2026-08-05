package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.camel.CamelSaddleModel.class)
public class CamelSaddleModel402449542Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1788086421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1788086421L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/CamelRenderState;)V", cancellable = true)
    private void setupAnim_744686621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(744686621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSaddleLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSaddleLayer__311682622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311682622L))
            info.setReturnValue(null);
    }


}
