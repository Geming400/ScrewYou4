package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.polarbear.PolarBearModel.class)
public class PolarBearModel1924610553Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_20955944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20955944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__1666636052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1666636052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1686708198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1686708198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/PolarBearRenderState;)V", cancellable = true)
    private void setupAnim_1070299546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1070299546L))
            info.cancel();
    }


}
