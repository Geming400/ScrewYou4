package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.allay.AllayModel.class)
public class AllayModel_1499229308Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2112089444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2112089444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AllayRenderState;)V", cancellable = true)
    private void setupAnim_606919075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(606919075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_1098815734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1098815734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/AllayRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_1754712868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1754712868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__404425302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404425302L))
            info.setReturnValue(null);
    }


}
