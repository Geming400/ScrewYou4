package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DamageType.class)
public class DamageType_650220713Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__258405556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-258405556L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1420644237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420644237L))
            info.setReturnValue("k#FKKECEs\"US\u070D}.--5Uw\u806E)o'o3 fT=1nq!-HVA\u38A1nt#\u4772Ok)\u5C9D \u28BF\uCAB3|!ho/|\u26D2o1zf^5NUV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1207572803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207572803L))
            info.setReturnValue(543388745);
    }

    @Inject(at = @At("HEAD"), method = "effects()Lnet/minecraft/world/damagesource/DamageEffects;", cancellable = true)
    private void effects__1494638503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494638503L))
            info.setReturnValue(net.minecraft.world.damagesource.DamageEffects.POKING);
    }

    @Inject(at = @At("HEAD"), method = "msgId()Ljava/lang/String;", cancellable = true)
    private void msgId_645456813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645456813L))
            info.setReturnValue("0w88");
    }

    @Inject(at = @At("HEAD"), method = "scaling()Lnet/minecraft/world/damagesource/DamageScaling;", cancellable = true)
    private void scaling_121638329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(121638329L))
            info.setReturnValue(net.minecraft.world.damagesource.DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER);
    }

    @Inject(at = @At("HEAD"), method = "exhaustion()F", cancellable = true)
    private void exhaustion__1954211987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1954211987L))
            info.setReturnValue(1.354941E8F);
    }

    @Inject(at = @At("HEAD"), method = "deathMessageType()Lnet/minecraft/world/damagesource/DeathMessageType;", cancellable = true)
    private void deathMessageType_1602075006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602075006L))
            info.setReturnValue(net.minecraft.world.damagesource.DeathMessageType.DEFAULT);
    }


}
