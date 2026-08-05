package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.allay.AllayModel.class)
public class AllayModel_1499229308Mixin {
        @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__485863298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-485863298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/AllayRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_41026204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(41026204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_785097143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785097143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1410101110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1410101110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AllayRenderState;)V", cancellable = true)
    private void setupAnim__2127351051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2127351051L))
            info.cancel();
    }


}
