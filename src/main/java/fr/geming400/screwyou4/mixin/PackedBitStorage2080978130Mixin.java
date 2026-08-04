package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.PackedBitStorage.class)
public class PackedBitStorage2080978130Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)I", cancellable = true)
    private void get__1000084687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1000084687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(II)V", cancellable = true)
    private void set_1085098661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1085098661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBits()I", cancellable = true)
    private void getBits_2119240376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119240376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRaw()[J", cancellable = true)
    private void getRaw__1028146848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028146848L))
            info.setReturnValue(null);
    }


}
