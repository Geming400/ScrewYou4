package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.CrashReportCategory.Entry.class)
public class Entry917812465Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value__217648006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217648006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1991642572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991642572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__217647510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217647510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_956075207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(956075207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/lang/String;", cancellable = true)
    private void key__217648006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217648006L))
            info.setReturnValue(null);
    }


}
