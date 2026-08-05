package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.GraphicsPreset.class)
public class GraphicsPreset956830222Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/GraphicsPreset;", cancellable = true)
    private static void values__434013415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434013415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/GraphicsPreset;", cancellable = true)
    private static void valueOf_324642802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(324642802L))
            info.setReturnValue(net.minecraft.client.GraphicsPreset.FANCY);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/client/Minecraft;)V", cancellable = true)
    private void apply__2071397627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2071397627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getKey()Ljava/lang/String;", cancellable = true)
    private void getKey__2061571072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061571072L))
            info.setReturnValue("@68^LIUQ}M\uB64CD\uB2ED\uA302&P5zG\u1F35#{Pni9OM{\u76FA\u94372Z\u5383b&iA6}A 9.v\u4F1Bd;FQ\u537F`a\u5A81\u6AE9v)D<j\u464D(b22F=\uCF67LM.E'#\uD7E4M");
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1045038844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1045038844L))
            info.setReturnValue("PGtTIEkj^STg\u5A19\u4E1B9s>\uA2AC#(.) e\uC322\"E!Rls 9!*SDPJ\uA0E3gb0kz-i&'{AOx\u9C73\u6F02=nJ)A-\uBE91d-\uCE3FZe\u79F4-P3\u94DDkN9T");
    }


}
