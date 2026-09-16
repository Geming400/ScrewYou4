package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debugchart.LocalSampleLogger.class)
public class LocalSampleLogger_264342761Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_708074349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708074349L))
            info.setReturnValue(-708751774);
    }

    @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__1465094228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1465094228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(II)J", cancellable = true)
    private void get__1359341159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1359341159L))
            info.setReturnValue(4991097452136896360L);
    }

    @Inject(at = @At("HEAD"), method = "get(I)J", cancellable = true)
    private void get__204571170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204571170L))
            info.setReturnValue(7745648901922605280L);
    }

    @Inject(at = @At("HEAD"), method = "capacity()I", cancellable = true)
    private void capacity__1517931948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1517931948L))
            info.setReturnValue(-1263291905);
    }


}
