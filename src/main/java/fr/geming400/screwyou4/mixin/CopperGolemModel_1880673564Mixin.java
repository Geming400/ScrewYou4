package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.golem.CopperGolemModel.class)
public class CopperGolemModel_1880673564Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead__2017901078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017901078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1730645188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1730645188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/CopperGolemRenderState;)V", cancellable = true)
    private void setupAnim_1202895933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1202895933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyBlockOnAntennaTransform(Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void applyBlockOnAntennaTransform__847179531(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-847179531L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_1480259990(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1480259990L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/CopperGolemRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_1484607370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1484607370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHead(Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHead_305683479(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(305683479L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__22981046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22981046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createStarPoseBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createStarPoseBodyLayer_1324715719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324715719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRunningPoseBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createRunningPoseBodyLayer__58996750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-58996750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEyesLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createEyesLayer_665181066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665181066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSittingPoseBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSittingPoseBodyLayer_69655237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69655237L))
            info.setReturnValue(null);
    }


}
