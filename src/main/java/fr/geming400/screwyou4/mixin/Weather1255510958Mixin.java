package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.Weather.class)
public class Weather1255510958Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1653944079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1653944079L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_120050983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(120050983L))
            info.setReturnValue("':Nd`uꬱ^Dꪶ)2zDﲜ_/⠵>W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1293773700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1293773700L))
            info.setReturnValue(-791752836);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__1454265512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454265512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/gametest/framework/TestEnvironmentDefinition$Weather$Type;", cancellable = true)
    private void setup_1480010561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480010561L))
            info.setReturnValue(net.minecraft.gametest.framework.TestEnvironmentDefinition.Weather.Type.CLEAR);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown__1561925810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1561925810L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/gametest/framework/TestEnvironmentDefinition$Weather$Type;)V", cancellable = true)
    private void teardown_158436613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(158436613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1303602614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1303602614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weather()Lnet/minecraft/gametest/framework/TestEnvironmentDefinition$Weather$Type;", cancellable = true)
    private void weather__1915620752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915620752L))
            info.setReturnValue(net.minecraft.gametest.framework.TestEnvironmentDefinition.Weather.Type.THUNDER);
    }


}
