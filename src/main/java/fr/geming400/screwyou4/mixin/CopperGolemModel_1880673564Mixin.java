package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.golem.CopperGolemModel.class)
public class CopperGolemModel_1880673564Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead__889070848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889070848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/CopperGolemRenderState;)V", cancellable = true)
    private void setupAnim_1150373903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1150373903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1028656854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1028656854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/CopperGolemRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_616500482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(616500482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__104419042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-104419042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHead(Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHead_1928137070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1928137070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1166541399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166541399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyBlockOnAntennaTransform(Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void applyBlockOnAntennaTransform_1928137070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1928137070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSittingPoseBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSittingPoseBodyLayer_1166541399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166541399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createStarPoseBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createStarPoseBodyLayer_1166541399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166541399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEyesLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createEyesLayer_1166541399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166541399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRunningPoseBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createRunningPoseBodyLayer_1166541399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166541399L))
            info.setReturnValue(null);
    }


}
