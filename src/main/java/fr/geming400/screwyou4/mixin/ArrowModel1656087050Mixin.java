package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.projectile.ArrowModel.class)
public class ArrowModel1656087050Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_941954886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941954886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1253243367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1253243367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ArrowRenderState;)V", cancellable = true)
    private void setupAnim__386098444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-386098444L))
            info.cancel();
    }


}
