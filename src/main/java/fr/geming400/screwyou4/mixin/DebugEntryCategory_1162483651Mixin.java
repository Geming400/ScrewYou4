package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryCategory.class)
public class DebugEntryCategory_1162483651Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_253857382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253857382L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1932907175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932907175L))
            info.setReturnValue("cKAXtSqhE@zZ7UYy\u0B88uL\uA73Ccy[0^iHf\u15C3K6Jd%^rX");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1719835741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719835741L))
            info.setReturnValue(1809248817);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label_1774757449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1774757449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sortKey()F", cancellable = true)
    private void sortKey_1602700068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602700068L))
            info.setReturnValue(2.50996E8F);
    }


}
