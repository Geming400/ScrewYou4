package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.RetryOptions.class)
public class RetryOptions1076360264Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_167733996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167733996L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1846783789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846783789L))
            info.setReturnValue("Y6,0\u514BoMwk8sQi1)\"?T\u5040\u4D70h\u810D;b5CgMuaie\uFC14EV\u23EBE{\uAA9Ai!jZ\uD60A{0pr;OgyB_S.'I\u5727XogG,Mmx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1633712355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633712355L))
            info.setReturnValue(-800245257);
    }

    @Inject(at = @At("HEAD"), method = "hasTriesLeft(II)Z", cancellable = true)
    private void hasTriesLeft_1036854425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036854425L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unlimitedTries()Z", cancellable = true)
    private void unlimitedTries__575987257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575987257L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "noRetries()Lnet/minecraft/gametest/framework/RetryOptions;", cancellable = true)
    private static void noRetries__762716287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762716287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "haltOnFailure()Z", cancellable = true)
    private void haltOnFailure__1211674411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211674411L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "numberOfTries()I", cancellable = true)
    private void numberOfTries_2057758037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2057758037L))
            info.setReturnValue(-889585725);
    }

    @Inject(at = @At("HEAD"), method = "hasRetries()Z", cancellable = true)
    private void hasRetries__1463235533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463235533L))
            info.setReturnValue(false);
    }


}
