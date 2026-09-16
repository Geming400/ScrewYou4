package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.FishingHookRenderer.class)
public class FishingHookRenderer_630814878Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__446677943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-446677943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/FishingHookRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__2040403197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2040403197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHoldingArm(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private static void getHoldingArm_74075571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(74075571L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/projectile/FishingHook;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender_219018934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219018934L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__1801136518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1801136518L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/FishingHook;Lnet/minecraft/client/renderer/entity/state/FishingHookRenderState;F)V", cancellable = true)
    private void extractRenderState_1065743578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1065743578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_68593070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(68593070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FishingHookRenderState;", cancellable = true)
    private void createRenderState_1259916902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259916902L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.FishingHookRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_883985856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883985856L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
