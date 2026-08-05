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
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_63226581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(63226581L))
            info.setReturnValue("2'HDx<${\u5F60AA\u5BC1|PrP\uC155hq:p*YOJ5/e8H\u0C6B\u45DC-7_fq?R[JKR^Oile]`\u3729\u13D9*\uB903-[1a\u7297+ZHa\uCA91++`/p:mgC\u3BCF-\u56F4mZ!q'dx,K6Cnv\uA05Bl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1236949298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236949298L))
            info.setReturnValue(-1853645278);
    }

    @Inject(at = @At("HEAD"), method = "range()F", cancellable = true)
    private void range_1236945919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236945919L))
            info.setReturnValue(2.413324E8F);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__978222609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978222609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void soundEvent__1547404968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1547404968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useDuration()F", cancellable = true)
    private void useDuration_1236945919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236945919L))
            info.setReturnValue(2.413324E8F);
    }


}
