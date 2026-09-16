package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.projectile.ShulkerBulletModel.class)
public class ShulkerBulletModel_1794060507Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1817258245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1817258245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ShulkerBulletRenderState;)V", cancellable = true)
    private void setupAnim_1699291575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1699291575L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__109594103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109594103L))
            info.setReturnValue(null);
    }


}
