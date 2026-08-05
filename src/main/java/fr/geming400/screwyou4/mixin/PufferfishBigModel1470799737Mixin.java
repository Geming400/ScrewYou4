package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.PufferfishBigModel.class)
public class PufferfishBigModel1470799737Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__432854872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432854872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2140519014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2140519014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim_147775395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(147775395L))
            info.cancel();
    }


}
