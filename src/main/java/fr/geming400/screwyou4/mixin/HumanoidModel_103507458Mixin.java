package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.HumanoidModel.class)
public class HumanoidModel_103507458Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead_499900112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499900112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__959809566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-959809566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__296906116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-296906116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBabyArmorMeshSet(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/PartPose;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void createBabyArmorMeshSet__1220391939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220391939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createArmorMeshSet(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void createArmorMeshSet_1925485173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925485173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_787156002(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(787156002L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim__311707451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-311707451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMesh(Lnet/minecraft/client/model/geom/builders/CubeDeformation;F)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createMesh_1371041364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371041364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArm(Lnet/minecraft/world/entity/HumanoidArm;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getArm_726835435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726835435L))
            info.setReturnValue(null);
    }


}
