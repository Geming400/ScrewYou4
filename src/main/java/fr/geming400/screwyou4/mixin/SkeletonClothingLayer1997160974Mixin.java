package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.SkeletonClothingLayer.class)
public class SkeletonClothingLayer1997160974Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/SkeletonRenderState;FF)V", cancellable = true)
    private void submit_526227529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(526227529L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit_1539397343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1539397343L))
            info.cancel();
    }


}
