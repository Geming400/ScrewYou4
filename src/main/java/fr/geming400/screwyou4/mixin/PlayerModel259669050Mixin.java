package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.player.PlayerModel.class)
public class PlayerModel259669050Mixin {
        @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_632192831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(632192831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__140744523(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-140744523L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createArmorMeshSet(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void createArmorMeshSet_2081646766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081646766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomBodyPart(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getRandomBodyPart_2103510861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103510861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_943317595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(943317595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)V", cancellable = true)
    private void setupAnim__450515494(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-450515494L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim__155416898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-155416898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMesh(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Z)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createMesh__331886943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331886943L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }


}
