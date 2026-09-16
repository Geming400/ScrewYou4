package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.sounds.SoundEvent.class)
public class SoundEvent332700829Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__575925439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575925439L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1103124354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103124354L))
            info.setReturnValue("D8*<>EH\u88FD0A0W7evO'qS\uD768K*bz\u4D29+lGq=\u9DC2\u7DAE})_>l-H6-kB#l*g-\u5742");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_890052920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890052920L))
            info.setReturnValue(-1881952040);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location_544827033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544827033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRange(F)F", cancellable = true)
    private void getRange_1935466365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935466365L))
            info.setReturnValue(3.979961E8F);
    }

    @Inject(at = @At("HEAD"), method = "createFixedRangeEvent(Lnet/minecraft/resources/Identifier;F)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private static void createFixedRangeEvent__1468644550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1468644550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVariableRangeEvent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private static void createVariableRangeEvent_876551370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876551370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedRange()Ljava/util/Optional;", cancellable = true)
    private void fixedRange_1973505396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973505396L))
            info.setReturnValue(null);
    }


}
