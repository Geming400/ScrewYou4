package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.hoglin.HoglinModel.class)
public class HoglinModel2038094922Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1573223829(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1573223829L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HoglinRenderState;)V", cancellable = true)
    private void setupAnim__2030091550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2030091550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_134440313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134440313L))
            info.setReturnValue(null);
    }


}
