package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.SalmonModel.class)
public class SalmonModel1559638253Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2051680498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2051680498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SalmonRenderState;)V", cancellable = true)
    private void setupAnim_1897598370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1897598370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__344016356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-344016356L))
            info.setReturnValue(null);
    }


}
