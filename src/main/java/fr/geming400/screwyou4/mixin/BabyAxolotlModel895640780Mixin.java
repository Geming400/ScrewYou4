package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.axolotl.BabyAxolotlModel.class)
public class BabyAxolotlModel895640780Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_181508616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181508616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2013689637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2013689637L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AxolotlRenderState;)V", cancellable = true)
    private void setupAnim__1791011200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1791011200L))
            info.cancel();
    }


}
