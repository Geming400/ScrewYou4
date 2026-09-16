package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.skeleton.SkeletonModel.class)
public class SkeletonModel1333749518Mixin {
        @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_194073631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(194073631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_933335945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(933335945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__569905091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-569905091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSingleModelDualBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSingleModelDualBodyLayer_872495704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872495704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_2017398063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2017398063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_918663570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(918663570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)V", cancellable = true)
    private void setupAnim_485945506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(485945506L))
            info.cancel();
    }


}
