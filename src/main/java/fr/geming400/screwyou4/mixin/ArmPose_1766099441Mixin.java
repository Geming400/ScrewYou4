package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.HumanoidModel.ArmPose.class)
public class ArmPose_1766099441Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/model/HumanoidModel$ArmPose;", cancellable = true)
    private static void values_114825008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114825008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/model/HumanoidModel$ArmPose;", cancellable = true)
    private static void valueOf__2006123411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006123411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "affectsOffhandPose()Z", cancellable = true)
    private void affectsOffhandPose_1804378023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804378023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTwoHanded()Z", cancellable = true)
    private void isTwoHanded_1804378023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804378023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateUseItem(Lnet/minecraft/client/renderer/entity/state/ArmedEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;FLnet/minecraft/world/entity/HumanoidArm;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void animateUseItem_1322713525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1322713525L))
            info.cancel();
    }


}
