package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.IronGolemCrackinessLayer.class)
public class IronGolemCrackinessLayer_1853498289Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/IronGolemRenderState;FF)V", cancellable = true)
    private void submit__1163253788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1163253788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit__1065959783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1065959783L))
            info.cancel();
    }


}
