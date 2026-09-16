package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.TropicalFishLargeModel.class)
public class TropicalFishLargeModel_620706640Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1304355184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1304355184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;)V", cancellable = true)
    private void setupAnim_862191922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(862191922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__996970128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-996970128L))
            info.setReturnValue(null);
    }


}
