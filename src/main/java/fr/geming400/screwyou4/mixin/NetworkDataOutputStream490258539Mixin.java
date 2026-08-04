package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.NetworkDataOutputStream.class)
public class NetworkDataOutputStream490258539Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_528533278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(528533278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(I)V", cancellable = true)
    private void write_1704175511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1704175511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeInt(I)V", cancellable = true)
    private void writeInt_1704175511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1704175511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeShort(S)V", cancellable = true)
    private void writeShort_1713410721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1713410721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toByteArray()[B", cancellable = true)
    private void toByteArray_1676093169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676093169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes([B)V", cancellable = true)
    private void writeBytes_3239141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(3239141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeFloat(F)V", cancellable = true)
    private void writeFloat_1701404948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1701404948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeString(Ljava/lang/String;)V", cancellable = true)
    private void writeString_1642619688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1642619688L))
            info.cancel();
    }


}
