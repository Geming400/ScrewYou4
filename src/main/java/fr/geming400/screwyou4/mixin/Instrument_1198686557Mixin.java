package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.Instrument.class)
public class Instrument_1198686557Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_290060288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(290060288L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1969110081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969110081L))
            info.setReturnValue(" a6f%eBHRI\uB50CdY07 'De_$+@i!Q}FN>2_\uAA50`\u32BC\uAD84\u30387\u6C98\uC94C_'XM{!\u1519V\u5068U\u3447ifb\u289Ed{\"c,|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1756038647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756038647L))
            info.setReturnValue(242751240);
    }

    @Inject(at = @At("HEAD"), method = "range()F", cancellable = true)
    private void range__669429534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669429534L))
            info.setReturnValue(3.794222E8F);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description_884755179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884755179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useDuration()F", cancellable = true)
    private void useDuration_235288740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235288740L))
            info.setReturnValue(3.80421E8F);
    }

    @Inject(at = @At("HEAD"), method = "soundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void soundEvent__1791175379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1791175379L))
            info.setReturnValue(null);
    }


}
