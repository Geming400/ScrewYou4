package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.crystal.EndCrystalModel.class)
public class EndCrystalModel_438513984Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__275618181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-275618181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1824150862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1824150862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EndCrystalRenderState;)V", cancellable = true)
    private void setupAnim__1622438065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1622438065L))
            info.cancel();
    }


}
