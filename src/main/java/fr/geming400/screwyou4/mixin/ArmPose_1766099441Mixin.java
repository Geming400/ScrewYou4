package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.HumanoidModel.ArmPose.class)
public class ArmPose_1766099441Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/model/HumanoidModel$ArmPose;", cancellable = true)
    private static void values_341629902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(341629902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/model/HumanoidModel$ArmPose;", cancellable = true)
    private static void valueOf__1244915819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244915819L))
            info.setReturnValue(net.minecraft.client.model.HumanoidModel.ArmPose.CROSSBOW_HOLD);
    }

    @Inject(at = @At("HEAD"), method = "affectsOffhandPose()Z", cancellable = true)
    private void affectsOffhandPose__825157354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825157354L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isTwoHanded()Z", cancellable = true)
    private void isTwoHanded__492594953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492594953L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "animateUseItem(Lnet/minecraft/client/renderer/entity/state/ArmedEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;FLnet/minecraft/world/entity/HumanoidArm;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void animateUseItem__761667698(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-761667698L))
            info.cancel();
    }


}
