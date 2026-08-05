package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.FontOption.class)
public class FontOption1174756476Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/font/FontOption;", cancellable = true)
    private static void values_1050511067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050511067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/font/FontOption;", cancellable = true)
    private static void valueOf_1249245464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249245464L))
            info.setReturnValue(net.minecraft.client.gui.font.FontOption.UNIFORM);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_39296005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39296005L))
            info.setReturnValue("G!(gv5q[c\u43CD!:$&k?,sG>Mb-\"V5AR(uIA\uC886\u18E31(X)xO\uCDC3yV-|7ErKL\u41D3\u954B>@iej/ME1\u89B0PECy\u5E9FebOT5x);)lD\u8540H");
    }


}
