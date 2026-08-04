package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.Zone.class)
public class Zone_100971198Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_139245936(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(139245936L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setColor(I)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void setColor__1601538900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601538900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addValue(J)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void addValue_1770744813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770744813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addText(Ljava/lang/String;)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void addText_481627133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481627133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addText(Ljava/util/function/Supplier;)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void addText__1192705273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192705273L))
            info.setReturnValue(null);
    }


}
