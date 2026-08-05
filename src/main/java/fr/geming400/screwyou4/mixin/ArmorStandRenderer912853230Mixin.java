package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ArmorStandRenderer.class)
public class ArmorStandRenderer912853230Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__554527614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-554527614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ArmorStandRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__879199154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-879199154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_165837209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(165837209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/decoration/ArmorStand;Lnet/minecraft/client/renderer/entity/state/ArmorStandRenderState;F)V", cancellable = true)
    private void extractRenderState_1211679690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1211679690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1932717433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1932717433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1139972249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1139972249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ArmorStandRenderState;", cancellable = true)
    private void createRenderState__442889850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442889850L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ArmorStandRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_324216786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(324216786L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ArmorStandRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1294517700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1294517700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1379477433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379477433L))
            info.setReturnValue(null);
    }


}
