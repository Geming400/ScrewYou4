package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.ExplosionData.class)
public class ExplosionData36760640Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__871865628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-871865628L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_807184165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807184165L))
            info.setReturnValue("c=\u7AE4BbV\u881BW;xC$iVfk&Hj8\u7826\uB793U>j\"5EEuXj\u85AECMJ\u41F4\u2C54V\uC99AqL)*<nMGI46^Tc\u047C0(\u9345\u63C0CM'Lt?a\u9F94J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_594112731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594112731L))
            info.setReturnValue(-21465484);
    }

    @Inject(at = @At("HEAD"), method = "power()I", cancellable = true)
    private void power_424678465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424678465L))
            info.setReturnValue(66449658);
    }

    @Inject(at = @At("HEAD"), method = "causesFire()Z", cancellable = true)
    private void causesFire__1405766793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1405766793L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fuse()I", cancellable = true)
    private void fuse_23892837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23892837L))
            info.setReturnValue(459088283);
    }


}
