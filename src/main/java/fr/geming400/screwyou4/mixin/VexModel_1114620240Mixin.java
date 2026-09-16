package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.vex.VexModel.class)
public class VexModel_1114620240Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/VexRenderState;)V", cancellable = true)
    private void setupAnim__68952697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-68952697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1798268784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1798268784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_714206666(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(714206666L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/VexRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_433492072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(433492072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__789034370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789034370L))
            info.setReturnValue(null);
    }


}
