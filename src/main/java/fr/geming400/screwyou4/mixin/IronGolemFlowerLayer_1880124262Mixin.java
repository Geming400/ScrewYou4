package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.IronGolemFlowerLayer.class)
public class IronGolemFlowerLayer_1880124262Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/IronGolemRenderState;FF)V", cancellable = true)
    private void submit__1136627815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1136627815L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit__1039333810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1039333810L))
            info.cancel();
    }


}
