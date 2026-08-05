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
            info.setReturnValue("P_甞dr媗23M@)pnC-v`N0Jje1&G=puAJy-셲ORb>j+@9䟊)f}L0穌GUF㗃&nyhd淮w,sENZBc|䓐Me<Ou8o-^x&z{H꭪ﯶ`m)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_321781226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321781226L))
            info.setReturnValue(269186512);
    }

    @Inject(at = @At("HEAD"), method = "heights()Ljava/util/Optional;", cancellable = true)
    private void heights_528979906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(528979906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxSection()I", cancellable = true)
    private void maxSection_321780730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321780730L))
            info.setReturnValue(472333931);
    }

    @Inject(at = @At("HEAD"), method = "minSection()I", cancellable = true)
    private void minSection_321780730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321780730L))
            info.setReturnValue(472333931);
    }


}
