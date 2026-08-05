package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CowRenderer.class)
public class CowRenderer_306693216Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/CowRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1443914273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1443914273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1160687629(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1160687629L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__440322806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-440322806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/cow/Cow;Lnet/minecraft/client/renderer/entity/state/CowRenderState;F)V", cancellable = true)
    private void extractRenderState_1972951703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1972951703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_533812234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(533812234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1326557418(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1326557418L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CowRenderState;", cancellable = true)
    private void createRenderState_1085879365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085879365L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.CowRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__281943229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-281943229L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CowRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1879890995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879890995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1985637448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985637448L))
            info.setReturnValue(null);
    }


}
