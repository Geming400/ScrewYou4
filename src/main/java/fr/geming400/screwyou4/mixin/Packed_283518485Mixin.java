package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blending.BlendingData.Packed.class)
public class Packed_283518485Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1669030743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669030743L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__851941491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851941491L))
            info.setReturnValue("P_\u751Edr\u5A9723M@)pnC-v`N0Jje1&G=puAJy-\uC172ORb>j+@9\u47CA)f}L0\u7A4CGUF\u35C3&nyhd\u6DEEw,sENZBc|\u44D0Me<Ou8o-^x&z{H\uAB6A\uFBF6`m)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_321781226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321781226L))
            info.setReturnValue(229446012);
    }

    @Inject(at = @At("HEAD"), method = "heights()Ljava/util/Optional;", cancellable = true)
    private void heights_528979906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(528979906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxSection()I", cancellable = true)
    private void maxSection_321780730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321780730L))
            info.setReturnValue(432593431);
    }

    @Inject(at = @At("HEAD"), method = "minSection()I", cancellable = true)
    private void minSection_321780730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321780730L))
            info.setReturnValue(432593431);
    }


}
