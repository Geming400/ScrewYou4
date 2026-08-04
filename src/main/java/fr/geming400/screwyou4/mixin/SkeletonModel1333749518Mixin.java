package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.skeleton.SkeletonModel.class)
public class SkeletonModel1333749518Mixin {
        @Inject(at = @At("HEAD"), method = "createSingleModelDualBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSingleModelDualBodyLayer_619617354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619617354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_2030913959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2030913959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__651343087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-651343087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_619617354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619617354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1575580899(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1575580899L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim__1667891456(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1667891456L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)V", cancellable = true)
    private void setupAnim__2100609520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2100609520L))
            info.cancel();
    }


}
