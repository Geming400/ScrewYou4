package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.witch.WitchModel.class)
public class WitchModel33259606Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead_1558482491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558482491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__680872558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680872558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms_1921430820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1921430820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/WitchRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms_1983895508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1983895508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/WitchRenderState;)V", cancellable = true)
    private void setupAnim_591458558(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(591458558L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1418896485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1418896485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNose()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getNose_1558482491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558482491L))
            info.setReturnValue(null);
    }


}
