package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.Instrument.class)
public class Instrument_1198686557Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1710768481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710768481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_63226581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63226581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1236949298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236949298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "range()F", cancellable = true)
    private void range_1236945919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236945919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__978222609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978222609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useDuration()F", cancellable = true)
    private void useDuration_1236945919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236945919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void soundEvent__1547404968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1547404968L))
            info.setReturnValue(null);
    }


}
