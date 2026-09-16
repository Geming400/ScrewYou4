package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.illager.IllagerModel.class)
public class IllagerModel_1474401449Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead_1870794103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1870794103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2136917303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2136917303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;)V", cancellable = true)
    private void setupAnim_1586369459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1586369459L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHat()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHat_831642760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831642760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_1073987875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1073987875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToHand_1968938190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1968938190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__429253161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429253161L))
            info.setReturnValue(null);
    }


}
