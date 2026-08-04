package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.AnimationUtils.class)
public class AnimationUtils_514688949Mixin {
        @Inject(at = @At("HEAD"), method = "animateCrossbowHold(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;Z)V", cancellable = true)
    private static void animateCrossbowHold__217057807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-217057807L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateCrossbowCharge(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;FFZ)V", cancellable = true)
    private static void animateCrossbowCharge__270191703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-270191703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swingWeaponDown(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/world/entity/HumanoidArm;FF)V", cancellable = true)
    private static void swingWeaponDown_1580641546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1580641546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bobModelPart(Lnet/minecraft/client/model/geom/ModelPart;FF)V", cancellable = true)
    private static void bobModelPart_860409239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(860409239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateZombieArms(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;ZLnet/minecraft/client/renderer/entity/state/UndeadRenderState;)V", cancellable = true)
    private static void animateZombieArms_438832616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(438832616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bobArms(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;F)V", cancellable = true)
    private static void bobArms_2095154261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2095154261L))
            info.cancel();
    }


}
