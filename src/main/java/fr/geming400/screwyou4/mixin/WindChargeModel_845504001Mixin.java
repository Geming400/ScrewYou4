package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.projectile.WindChargeModel.class)
public class WindChargeModel_845504001Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_131371836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(131371836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2063826417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2063826417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim_659451672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(659451672L))
            info.cancel();
    }


}
