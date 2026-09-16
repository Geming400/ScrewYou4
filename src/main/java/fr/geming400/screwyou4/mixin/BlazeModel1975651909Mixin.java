package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.blaze.BlazeModel.class)
public class BlazeModel1975651909Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_71997300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71997300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__1615723656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1615723656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1635666842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1635666842L))
            info.cancel();
    }


}
