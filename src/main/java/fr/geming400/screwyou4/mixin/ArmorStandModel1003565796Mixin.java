package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.armorstand.ArmorStandModel.class)
public class ArmorStandModel1003565796Mixin {
        @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__981526809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-981526809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/ArmorStandRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_1496689331(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1496689331L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_289433632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289433632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1905764621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1905764621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ArmorStandRenderState;)V", cancellable = true)
    private void setupAnim__1572109072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1572109072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim__1998075178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1998075178L))
            info.cancel();
    }


}
