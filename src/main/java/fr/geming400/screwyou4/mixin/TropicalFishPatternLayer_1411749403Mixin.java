package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.TropicalFishPatternLayer.class)
public class TropicalFishPatternLayer_1411749403Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;FF)V", cancellable = true)
    private void submit_1855682940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1855682940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit__1507708669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1507708669L))
            info.cancel();
    }


}
