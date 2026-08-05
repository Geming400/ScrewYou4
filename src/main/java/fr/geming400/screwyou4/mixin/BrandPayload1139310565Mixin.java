package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.custom.BrandPayload.class)
public class BrandPayload1139310565Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload$Type;", cancellable = true)
    private void type__1177284220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177284220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1770144472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770144472L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_3850590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3850590L))
            info.setReturnValue("Z0CIE!IAqJ$TF4;c[[m|*:e?00H]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1177573307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177573307L))
            info.setReturnValue(-298758531);
    }

    @Inject(at = @At("HEAD"), method = "brand()Ljava/lang/String;", cancellable = true)
    private void brand_3850094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3850094L))
            info.setReturnValue("e|}AWꋄd)ze6+peGUJn7O+`})=f``i4e|ᢝ4YgJ,W193;d3FB70b#!xt[0tv07Xm!_Db㮚");
    }


}
