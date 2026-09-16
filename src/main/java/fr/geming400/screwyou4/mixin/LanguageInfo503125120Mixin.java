package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.language.LanguageInfo.class)
public class LanguageInfo503125120Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1312392276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312392276L))
            info.setReturnValue("#`S3i!o1Q:j0m&dd_tK7\u5C1A.kagAj(7\u36D1ps*U\uA4E6$w]2KKfGp\u02E8\u4A2EQT%N!Ew\uB525k2\u6527.4z1j");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__405501148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-405501148L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1273548645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1273548645L))
            info.setReturnValue("N`.>Ny<I`Ag,\uD579)t;?k-B1\uABC7W\u1551V/vY\u04DA;;>\u613Cr!\uD033Qq\u9CC0V?\u290Cb7}7H\u6A7FB<zFbK+k7Ik:+]\u16C7(u,9:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1060477211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060477211L))
            info.setReturnValue(-952528421);
    }

    @Inject(at = @At("HEAD"), method = "region()Ljava/lang/String;", cancellable = true)
    private void region__795014147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795014147L))
            info.setReturnValue("B],AW\uFEAAH:+gkR(j4!D}\"lS+UA");
    }

    @Inject(at = @At("HEAD"), method = "bidirectional()Z", cancellable = true)
    private void bidirectional_1872820948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1872820948L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toComponent_1307724629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307724629L))
            info.setReturnValue(null);
    }


}
