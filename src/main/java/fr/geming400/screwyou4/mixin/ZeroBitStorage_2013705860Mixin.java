package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ZeroBitStorage.class)
public class ZeroBitStorage_2013705860Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)I", cancellable = true)
    private void get__1067356958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067356958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/util/BitStorage;", cancellable = true)
    private void copy__1753208864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1753208864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(II)V", cancellable = true)
    private void set_1017826390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1017826390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_2051968105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051968105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAndSet(II)I", cancellable = true)
    private void getAndSet_1017813897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017813897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAll(Ljava/util/function/IntConsumer;)V", cancellable = true)
    private void getAll__596810377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-596810377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBits()I", cancellable = true)
    private void getBits_2051968105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051968105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack([I)V", cancellable = true)
    private void unpack_1533151108(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1533151108L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRaw()[J", cancellable = true)
    private void getRaw__1095419119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095419119L))
            info.setReturnValue(null);
    }


}
