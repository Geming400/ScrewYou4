package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SimpleBitStorage.class)
public class SimpleBitStorage_127043834Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)I", cancellable = true)
    private void get__341871058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341871058L))
            info.setReturnValue(644812528);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/util/BitStorage;", cancellable = true)
    private void copy__1601458495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601458495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(II)V", cancellable = true)
    private void set_440176682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(440176682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_561170632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561170632L))
            info.setReturnValue(799239098);
    }

    @Inject(at = @At("HEAD"), method = "getAndSet(II)I", cancellable = true)
    private void getAndSet_633229534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633229534L))
            info.setReturnValue(1819630268);
    }

    @Inject(at = @At("HEAD"), method = "getAll(Ljava/util/function/IntConsumer;)V", cancellable = true)
    private void getAll_1185596514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1185596514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBits()I", cancellable = true)
    private void getBits_593878755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593878755L))
            info.setReturnValue(1184228480);
    }

    @Inject(at = @At("HEAD"), method = "unpack([I)V", cancellable = true)
    private void unpack__1331977848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1331977848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRaw()[J", cancellable = true)
    private void getRaw_1199536377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199536377L))
            info.setReturnValue(null);
    }


}
