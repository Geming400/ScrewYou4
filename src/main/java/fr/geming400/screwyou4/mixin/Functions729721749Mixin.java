package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.Functions.class)
public class Functions729721749Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2115234008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115234008L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__405738226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-405738226L))
            info.setReturnValue("NJ \uBC73\u9E0BV\u2A51Ga;@&%ZR>eGr[\u60E6\uBF53gO[_2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_767984491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767984491L))
            info.setReturnValue(1522201980);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void setup_1242666157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1242666157L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__1980054721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980054721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown__2087715019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2087715019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/Unit;)V", cancellable = true)
    private void teardown_515773233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(515773233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1829391823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829391823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teardownFunction()Ljava/util/Optional;", cancellable = true)
    private void teardownFunction_975183171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975183171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupFunction()Ljava/util/Optional;", cancellable = true)
    private void setupFunction_975183171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975183171L))
            info.setReturnValue(null);
    }


}
