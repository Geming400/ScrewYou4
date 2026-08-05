package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.ArmorStand.ArmorStandPose.class)
public class ArmorStandPose_1930902561Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__978552477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978552477L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_795442585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795442585L))
            info.setReturnValue("Wjt3jqAgayvm!Wj^>|DP袴3g{wuvꌟCzXh8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1969165302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969165302L))
            info.setReturnValue(1838970792);
    }

    @Inject(at = @At("HEAD"), method = "head()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void head_1886654389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886654389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "body()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void body_1886654389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886654389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leftArm()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void leftArm_1886654389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886654389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rightArm()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void rightArm_1886654389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886654389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rightLeg()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void rightLeg_1886654389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886654389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leftLeg()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void leftLeg_1886654389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886654389L))
            info.setReturnValue(null);
    }


}
