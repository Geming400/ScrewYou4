package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.polarbear.PolarBearModel.class)
public class PolarBearModel1924610553Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__984719864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-984719864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_1000148314(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1000148314L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/PolarBearRenderState;)V", cancellable = true)
    private void setupAnim__1803494932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1803494932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1210478389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1210478389L))
            info.setReturnValue(null);
    }


}
