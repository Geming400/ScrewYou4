package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EnderDragonRenderer.class)
public class EnderDragonRenderer50064912Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EnderDragonRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1506337528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506337528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1027427908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1027427908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__512156895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-512156895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/boss/enderdragon/EnderDragon;Lnet/minecraft/client/renderer/entity/state/EnderDragonRenderState;F)V", cancellable = true)
    private void extractRenderState__229765663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-229765663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitCrystalBeams(FFFFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V", cancellable = true)
    private static void submitCrystalBeams__880663942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-880663942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_303235891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303235891L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EnderDragonRenderState;", cancellable = true)
    private void createRenderState__1518230649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518230649L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EnderDragonRenderState());
    }


}
