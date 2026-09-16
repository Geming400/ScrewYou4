package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.PackedBitStorage.class)
public class PackedBitStorage2080978130Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)I", cancellable = true)
    private void get_1612063239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612063239L))
            info.setReturnValue(-1049678724);
    }

    @Inject(at = @At("HEAD"), method = "set(II)V", cancellable = true)
    private void set__1900856317(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1900856317L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBits()I", cancellable = true)
    private void getBits__1747154244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747154244L))
            info.setReturnValue(-1405236330);
    }

    @Inject(at = @At("HEAD"), method = "getRaw()[J", cancellable = true)
    private void getRaw__1141496622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1141496622L))
            info.setReturnValue(null);
    }


}
