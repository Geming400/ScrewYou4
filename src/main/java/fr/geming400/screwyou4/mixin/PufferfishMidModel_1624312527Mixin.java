package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.PufferfishMidModel.class)
public class PufferfishMidModel_1624312527Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1987006225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1987006225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim_301288184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(301288184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__279342083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279342083L))
            info.setReturnValue(null);
    }


}
