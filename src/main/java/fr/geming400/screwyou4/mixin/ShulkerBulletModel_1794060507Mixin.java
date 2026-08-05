package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.projectile.ShulkerBulletModel.class)
public class ShulkerBulletModel_1794060507Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1115269911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1115269911L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ShulkerBulletRenderState;)V", cancellable = true)
    private void setupAnim__1529738999(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1529738999L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1079928342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079928342L))
            info.setReturnValue(null);
    }


}
