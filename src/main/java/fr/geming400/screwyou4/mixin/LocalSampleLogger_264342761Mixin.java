package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debugchart.LocalSampleLogger.class)
public class LocalSampleLogger_264342761Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_302605006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302605006L))
            info.setReturnValue(-351173181);
    }

    @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_302617499(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(302617499L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(II)J", cancellable = true)
    private void get__731548241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731548241L))
            info.setReturnValue(-8453667529772201539L);
    }

    @Inject(at = @At("HEAD"), method = "get(I)J", cancellable = true)
    private void get_1478248200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478248200L))
            info.setReturnValue(3628217471285743530L);
    }

    @Inject(at = @At("HEAD"), method = "capacity()I", cancellable = true)
    private void capacity_302605006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302605006L))
            info.setReturnValue(-351173181);
    }


}
