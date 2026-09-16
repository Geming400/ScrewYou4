package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.projectile.WindChargeModel.class)
public class WindChargeModel_845504001Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1529152545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1529152545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim__477520342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-477520342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1058150609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058150609L))
            info.setReturnValue(null);
    }


}
