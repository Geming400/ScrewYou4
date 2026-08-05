package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.DolphinCarryingItemLayer.class)
public class DolphinCarryingItemLayer1927096097Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/DolphinRenderState;FF)V", cancellable = true)
    private void submit_2018061231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2018061231L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit__992361974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-992361974L))
            info.cancel();
    }


}
