package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.illager.IllagerModel.class)
public class IllagerModel_1474401449Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead__1295342963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1295342963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1434928969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1434928969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;)V", cancellable = true)
    private void setupAnim__1822203771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1822203771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHat()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHat__1295342963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1295342963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand__510691157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-510691157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_88528454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(88528454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_760269284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760269284L))
            info.setReturnValue(null);
    }


}
