package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.HumanoidModel.class)
public class HumanoidModel_103507458Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead_1628730342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1628730342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_1396704819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1396704819L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1489144336(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1489144336L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getArm(Lnet/minecraft/world/entity/HumanoidArm;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getArm_1937622737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937622737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMesh(Lnet/minecraft/client/model/geom/builders/CubeDeformation;F)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createMesh__295004085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295004085L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__1881585148(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1881585148L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_877030762(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(877030762L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBabyArmorMeshSet(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/PartPose;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void createBabyArmorMeshSet__498098187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-498098187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createArmorMeshSet(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void createArmorMeshSet__949109405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949109405L))
            info.setReturnValue(null);
    }


}
