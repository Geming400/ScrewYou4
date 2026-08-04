package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.CustomHeadLayer.class)
public class CustomHeadLayer_1315333038Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit_857569406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(857569406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;FF)V", cancellable = true)
    private void submit__1338356153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1338356153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHead(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/entity/layers/CustomHeadLayer$Transforms;)V", cancellable = true)
    private static void translateToHead__1790374465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1790374465L))
            info.cancel();
    }


}
