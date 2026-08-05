package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SalmonRenderer.class)
public class SalmonRenderer_1343816379Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/SalmonRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_282820323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(282820323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_596800357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(596800357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__123564466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-123564466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1570935397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1570935397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/fish/Salmon;Lnet/minecraft/client/renderer/entity/state/SalmonRenderState;F)V", cancellable = true)
    private void extractRenderState_1954789385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1954789385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1931286715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1931286715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_755179934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755179934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SalmonRenderState;", cancellable = true)
    private void createRenderState_1074097449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074097449L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SalmonRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SalmonRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1223935727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223935727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__948514285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-948514285L))
            info.setReturnValue(null);
    }


}
