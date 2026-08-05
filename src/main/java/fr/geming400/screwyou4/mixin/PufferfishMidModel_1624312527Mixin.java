package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.PufferfishMidModel.class)
public class PufferfishMidModel_1624312527Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1285017891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1285017891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim_1438260198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1438260198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_910180362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910180362L))
            info.setReturnValue(null);
    }


}
