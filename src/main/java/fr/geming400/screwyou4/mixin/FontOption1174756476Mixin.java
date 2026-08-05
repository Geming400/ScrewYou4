package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.FontOption.class)
public class FontOption1174756476Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/font/FontOption;", cancellable = true)
    private static void values_1866975609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866975609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/font/FontOption;", cancellable = true)
    private static void valueOf_1284947008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1284947008L))
            info.setReturnValue(net.minecraft.client.gui.font.FontOption.JAPANESE_VARIANTS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1262965098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262965098L))
            info.setReturnValue("+G\u24FET\uB637\u2BB6\u1575 MtWx\u30C9\uADCArnS^^\u50CDVXI\"9fE<_n\u60E3#]lCi7)d");
    }


}
