package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.Weather.class)
public class Weather1255510958Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_346884690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346884690L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2025934483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025934483L))
            info.setReturnValue("nsf\u5AC2Is0D[8!zdcZAJJG\uA7D3g^E:l\"U\u2D84Icnw?Jw,w] w}DeLis!gB*OZ8plX#)A\u302F9U[S\u4A2C.:D%M#J\uAB965qE1\"/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1812863049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1812863049L))
            info.setReturnValue(-7087210);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__773850859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773850859L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/gametest/framework/TestEnvironmentDefinition$Weather$Type;", cancellable = true)
    private void setup_1676766436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676766436L))
            info.setReturnValue(net.minecraft.gametest.framework.TestEnvironmentDefinition.Weather.Type.THUNDER);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown_1878839498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1878839498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/gametest/framework/TestEnvironmentDefinition$Weather$Type;)V", cancellable = true)
    private void teardown_1887021065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1887021065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1973011084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973011084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weather()Lnet/minecraft/gametest/framework/TestEnvironmentDefinition$Weather$Type;", cancellable = true)
    private void weather__1573853444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573853444L))
            info.setReturnValue(net.minecraft.gametest.framework.TestEnvironmentDefinition.Weather.Type.CLEAR);
    }


}
