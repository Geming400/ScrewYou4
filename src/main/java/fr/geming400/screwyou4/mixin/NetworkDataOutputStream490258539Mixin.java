package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.NetworkDataOutputStream.class)
public class NetworkDataOutputStream490258539Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__1239178449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1239178449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(I)V", cancellable = true)
    private void write_629562422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(629562422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeInt(I)V", cancellable = true)
    private void writeInt_2098496295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2098496295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeShort(S)V", cancellable = true)
    private void writeShort_223463614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(223463614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toByteArray()[B", cancellable = true)
    private void toByteArray__1034090393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034090393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes([B)V", cancellable = true)
    private void writeBytes_1973371801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1973371801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeFloat(F)V", cancellable = true)
    private void writeFloat_1747930385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1747930385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeString(Ljava/lang/String;)V", cancellable = true)
    private void writeString_1818196056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1818196056L))
            info.cancel();
    }


}
