package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.ClockTime.class)
public class ClockTime1782380533Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_873754265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873754265L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1742163238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742163238L))
            info.setReturnValue("V\uBA5ELkg[mjfk rjNE<_.s/6h5f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1955234672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1955234672L))
            info.setReturnValue(625242986);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__246981284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246981284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Long;", cancellable = true)
    private void setup_97029247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(97029247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clock()Lnet/minecraft/core/Holder;", cancellable = true)
    private void clock_902894115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902894115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "time()I", cancellable = true)
    private void time_1766011694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766011694L))
            info.setReturnValue(983669699);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Long;)V", cancellable = true)
    private void teardown__1077145228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1077145228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown__1889258223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1889258223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1446141509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446141509L))
            info.setReturnValue(null);
    }


}
