package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Type.class)
public class Type202976555Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private static void values_69210377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69210377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private static void valueOf_2079002668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2079002668L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.INT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__932483916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932483916L))
            info.setReturnValue("'l\u0591L\u916B#RpDH\"@e6^F\u252C-QQczAf21DD\u73E4\u3FD3g_\u637DP4\u47DFYRASjv];\u9D83xt)?^\u0644-.>}[KEg>Mw$6\"H\u0389?sbJS\u24EAElz\uC2E2mL\u5E15Mjj0bpQ/`C");
    }


}
