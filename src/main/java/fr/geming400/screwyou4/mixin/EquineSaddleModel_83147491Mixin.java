package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.equine.EquineSaddleModel.class)
public class EquineSaddleModel_83147491Mixin {
        @Inject(at = @At("HEAD"), method = "createSaddleLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSaddleLayer__630984674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630984674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1468784369(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1468784369L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EquineRenderState;)V", cancellable = true)
    private void setupAnim_513400334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(513400334L))
            info.cancel();
    }


}
