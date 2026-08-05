package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.CustomHeadLayer.class)
public class CustomHeadLayer_1315333038Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit__1604125034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1604125034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;FF)V", cancellable = true)
    private void submit__833035681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-833035681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHead(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/entity/layers/CustomHeadLayer$Transforms;)V", cancellable = true)
    private static void translateToHead_409853800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(409853800L))
            info.cancel();
    }


}
