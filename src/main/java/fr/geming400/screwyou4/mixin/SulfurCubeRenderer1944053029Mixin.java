package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SulfurCubeRenderer.class)
public class SulfurCubeRenderer1944053029Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/SulfurCubeRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_621506054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(621506054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1889395736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1889395736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_866560209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(866560209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__378399432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378399432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SulfurCubeRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1822004394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822004394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1381831222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1381831222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/cubemob/SulfurCube;Lnet/minecraft/client/renderer/entity/state/SulfurCubeRenderState;F)V", cancellable = true)
    private void extractRenderState_1386227215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1386227215L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/cubemob/AbstractCubeMob;Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;F)V", cancellable = true)
    private void extractRenderState_1522913080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1522913080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_273579542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(273579542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SulfurCubeRenderState;", cancellable = true)
    private void createRenderState__1627747021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1627747021L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SulfurCubeRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__2097743288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097743288L))
            info.setReturnValue(null);
    }


}
