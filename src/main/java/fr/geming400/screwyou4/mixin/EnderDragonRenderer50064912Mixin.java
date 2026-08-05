package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EnderDragonRenderer.class)
public class EnderDragonRenderer50064912Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1417315932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1417315932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EnderDragonRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_117245472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(117245472L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitCrystalBeams(FFFFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V", cancellable = true)
    private static void submitCrystalBeams_622490292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(622490292L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_277183931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(277183931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/boss/enderdragon/EnderDragon;Lnet/minecraft/client/renderer/entity/state/EnderDragonRenderState;F)V", cancellable = true)
    private void extractRenderState__1638737145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1638737145L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EnderDragonRenderState;", cancellable = true)
    private void createRenderState_679709286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679709286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__538571532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538571532L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
