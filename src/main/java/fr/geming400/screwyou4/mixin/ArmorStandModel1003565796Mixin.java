package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.armorstand.ArmorStandModel.class)
public class ArmorStandModel1003565796Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_588479848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(588479848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1687214341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1687214341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ArmorStandRenderState;)V", cancellable = true)
    private void setupAnim_1616173826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1616173826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/ArmorStandRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_1524692779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1524692779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_603152223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(603152223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__900088813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900088813L))
            info.setReturnValue(null);
    }


}
