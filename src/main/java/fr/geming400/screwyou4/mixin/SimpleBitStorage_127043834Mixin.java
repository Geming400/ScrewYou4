package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SimpleBitStorage.class)
public class SimpleBitStorage_127043834Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)I", cancellable = true)
    private void get_1340948312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340948312L))
            info.setReturnValue(-1954369473);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/util/BitStorage;", cancellable = true)
    private void copy_655096406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655096406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(II)V", cancellable = true)
    private void set__868835636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-868835636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()I", cancellable = true)
    private void getSize_165306079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165306079L))
            info.setReturnValue(-1162771768);
    }

    @Inject(at = @At("HEAD"), method = "getAndSet(II)I", cancellable = true)
    private void getAndSet__868848129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-868848129L))
            info.setReturnValue(1300807038);
    }

    @Inject(at = @At("HEAD"), method = "getAll(Ljava/util/function/IntConsumer;)V", cancellable = true)
    private void getAll_1811494893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1811494893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBits()I", cancellable = true)
    private void getBits_165306079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165306079L))
            info.setReturnValue(-1162771768);
    }

    @Inject(at = @At("HEAD"), method = "unpack([I)V", cancellable = true)
    private void unpack__353510918(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-353510918L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRaw()[J", cancellable = true)
    private void getRaw_1312886151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312886151L))
            info.setReturnValue(null);
    }


}
