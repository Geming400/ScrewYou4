package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SalmonRenderer.class)
public class SalmonRenderer_1343816379Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/SalmonRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_672708347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(672708347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1805334909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1805334909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_266323558(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(266323558L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__978636083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978636083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SalmonRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_157166923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(157166923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__326657109(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-326657109L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_781594571(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(781594571L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/fish/Salmon;Lnet/minecraft/client/renderer/entity/state/SalmonRenderState;F)V", cancellable = true)
    private void extractRenderState__735548305(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-735548305L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SalmonRenderState;", cancellable = true)
    private void createRenderState_1915904872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915904872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1596987357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596987357L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
