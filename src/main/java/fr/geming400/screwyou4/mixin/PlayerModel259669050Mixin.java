package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.player.PlayerModel.class)
public class PlayerModel259669050Mixin {
        @Inject(at = @At("HEAD"), method = "getRandomBodyPart(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getRandomBodyPart_2142584767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142584767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__952486201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-952486201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__1725423555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1725423555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createArmorMeshSet(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void createArmorMeshSet__792947812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-792947812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_1552995372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1552995372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)V", cancellable = true)
    private void setupAnim_686456520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(686456520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1645305929(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1645305929L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMesh(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Z)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createMesh__1997932392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997932392L))
            info.setReturnValue(null);
    }


}
