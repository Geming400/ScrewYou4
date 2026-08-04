package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.TropicalFishSmallModel.class)
public class TropicalFishSmallModel_1892512412Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__896222583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-896222583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1016818006(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1016818006L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;)V", cancellable = true)
    private void setupAnim_505814764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(505814764L))
            info.cancel();
    }


}
