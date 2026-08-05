package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ThrownTridentRenderer.class)
public class ThrownTridentRenderer_1327889569Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__139491276(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-139491276L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ThrownTridentRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__936805439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-936805439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1555008587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1555008587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/arrow/ThrownTrident;Lnet/minecraft/client/renderer/entity/state/ThrownTridentRenderState;F)V", cancellable = true)
    private void extractRenderState__773473137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-773473137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ThrownTridentRenderState;", cancellable = true)
    private void createRenderState__263328955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-263328955L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ThrownTridentRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_739253124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739253124L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
