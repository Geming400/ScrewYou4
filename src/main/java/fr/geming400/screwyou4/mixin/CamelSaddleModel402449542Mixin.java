package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.camel.CamelSaddleModel.class)
public class CamelSaddleModel402449542Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1086098087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1086098087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/CamelRenderState;)V", cancellable = true)
    private void setupAnim__816010549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-816010549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSaddleLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSaddleLayer__144607504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-144607504L))
            info.setReturnValue(null);
    }


}
