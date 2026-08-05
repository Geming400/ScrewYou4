package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.OverlayMetadataSection.OverlayEntry.class)
public class OverlayEntry670785546Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2056297805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056297805L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__464674429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-464674429L))
            info.setReturnValue("ᮞML+(S[ሯ6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_709048288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(709048288L))
            info.setReturnValue(2141555328);
    }

    @Inject(at = @At("HEAD"), method = "format()Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void format_53794692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53794692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlay()Ljava/lang/String;", cancellable = true)
    private void overlay__464674925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-464674925L))
            info.setReturnValue("e&_Z<b‖CﶹmK");
    }

    @Inject(at = @At("HEAD"), method = "isApplicable(Lnet/minecraft/server/packs/metadata/pack/PackFormat;)Z", cancellable = true)
    private void isApplicable_1312091909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312091909L))
            info.setReturnValue(false);
    }


}
