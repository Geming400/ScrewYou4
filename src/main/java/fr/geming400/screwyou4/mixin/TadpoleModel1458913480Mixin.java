package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.frog.TadpoleModel.class)
public class TadpoleModel1458913480Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1450416937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1450416937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_534322281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(534322281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_744781316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744781316L))
            info.setReturnValue(null);
    }


}
