package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.TropicalFishSmallModel.class)
public class TropicalFishSmallModel_1892512412Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_274835644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274835644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1718806340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1718806340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;)V", cancellable = true)
    private void setupAnim_2133997694(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2133997694L))
            info.cancel();
    }


}
