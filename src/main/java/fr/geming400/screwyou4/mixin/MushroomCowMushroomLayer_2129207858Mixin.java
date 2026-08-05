package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.MushroomCowMushroomLayer.class)
public class MushroomCowMushroomLayer_2129207858Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit__790250214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-790250214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/MushroomCowRenderState;FF)V", cancellable = true)
    private void submit__683573964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-683573964L))
            info.cancel();
    }


}
