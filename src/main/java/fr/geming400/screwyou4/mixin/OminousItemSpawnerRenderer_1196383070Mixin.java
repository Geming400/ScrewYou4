package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.OminousItemSpawnerRenderer.class)
public class OminousItemSpawnerRenderer_1196383070Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__270997775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-270997775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__52764031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-52764031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/OminousItemSpawner;Lnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;F)V", cancellable = true)
    private void extractRenderState__988119870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-988119870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1423502088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423502088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;", cancellable = true)
    private void createRenderState__1328435425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328435425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_607746625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607746625L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
