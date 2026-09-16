package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.AnimationUtils.class)
public class AnimationUtils_514688949Mixin {
        @Inject(at = @At("HEAD"), method = "bobArms(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;F)V", cancellable = true)
    private static void bobArms_1926998849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1926998849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateCrossbowCharge(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;FFZ)V", cancellable = true)
    private static void animateCrossbowCharge_1978636680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1978636680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateCrossbowHold(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;Z)V", cancellable = true)
    private static void animateCrossbowHold_664996807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(664996807L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateZombieArms(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;ZLnet/minecraft/client/renderer/entity/state/UndeadRenderState;)V", cancellable = true)
    private static void animateZombieArms__109254906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-109254906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bobModelPart(Lnet/minecraft/client/model/geom/ModelPart;FF)V", cancellable = true)
    private static void bobModelPart__2075602338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2075602338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swingWeaponDown(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/world/entity/HumanoidArm;FF)V", cancellable = true)
    private static void swingWeaponDown_2040444942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2040444942L))
            info.cancel();
    }


}
