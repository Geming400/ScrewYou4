package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.vex.VexModel.class)
public class VexModel_1114620240Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/VexRenderState;)V", cancellable = true)
    private void setupAnim__621517991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-621517991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1794710178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1794710178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__870472366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-870472366L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/VexRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__712423968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-712423968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_400488075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(400488075L))
            info.setReturnValue(null);
    }


}
