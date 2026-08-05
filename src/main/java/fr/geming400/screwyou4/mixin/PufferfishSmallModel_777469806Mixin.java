package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.PufferfishSmallModel.class)
public class PufferfishSmallModel_777469806Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2131860612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2131860612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim_591417477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(591417477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_63337641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63337641L))
            info.setReturnValue(null);
    }


}
