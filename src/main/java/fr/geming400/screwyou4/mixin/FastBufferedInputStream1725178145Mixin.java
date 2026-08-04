package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.FastBufferedInputStream.class)
public class FastBufferedInputStream1725178145Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1763452884(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1763452884L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read([BII)I", cancellable = true)
    private void read__1567205842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1567205842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read()I", cancellable = true)
    private void read_1763440391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763440391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skip(J)J", cancellable = true)
    private void skip__1354960190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1354960190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "available()I", cancellable = true)
    private void available_1763440391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763440391L))
            info.setReturnValue(null);
    }


}
