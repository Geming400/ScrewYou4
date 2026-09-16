package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.Zone.class)
public class Zone_100971198Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__2013604232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2013604232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setColor(I)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void setColor__2108493875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108493875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addValue(J)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void addValue_123683133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123683133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addText(Ljava/lang/String;)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void addText_1252598351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252598351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addText(Ljava/util/function/Supplier;)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void addText__980294283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980294283L))
            info.setReturnValue(null);
    }


}
