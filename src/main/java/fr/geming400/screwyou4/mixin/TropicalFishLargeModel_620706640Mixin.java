package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.TropicalFishLargeModel.class)
public class TropicalFishLargeModel_620706640Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_2006343518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2006343518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;)V", cancellable = true)
    private void setupAnim__765991008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-765991008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_2126938941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126938941L))
            info.setReturnValue(null);
    }


}
