package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.SulfurCubeInnerLayer.class)
public class SulfurCubeInnerLayer_1998824431Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/SulfurCubeRenderState;FF)V", cancellable = true)
    private void submit__2061736534(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2061736534L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit_1541060799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1541060799L))
            info.cancel();
    }


}
