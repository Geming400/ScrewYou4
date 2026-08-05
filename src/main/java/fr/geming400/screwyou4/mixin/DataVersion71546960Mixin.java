package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.DataVersion.class)
public class DataVersion71546960Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__837079308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837079308L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_841970485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841970485L))
            info.setReturnValue("{ G&z@uc\u2734OD:3");
    }

    @Inject(at = @At("HEAD"), method = "version()I", cancellable = true)
    private void version__83969954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-83969954L))
            info.setReturnValue(-310786889);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_628899051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628899051L))
            info.setReturnValue(1546239945);
    }

    @Inject(at = @At("HEAD"), method = "isCompatible(Lnet/minecraft/world/level/storage/DataVersion;)Z", cancellable = true)
    private void isCompatible_1381670302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1381670302L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "series()Ljava/lang/String;", cancellable = true)
    private void series_1458811664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458811664L))
            info.setReturnValue("S58868#t0u+JXNiY9g&Q");
    }

    @Inject(at = @At("HEAD"), method = "isSideSeries()Z", cancellable = true)
    private void isSideSeries_1462079887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462079887L))
            info.setReturnValue(false);
    }


}
