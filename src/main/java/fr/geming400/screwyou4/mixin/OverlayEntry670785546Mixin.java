package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.OverlayMetadataSection.OverlayEntry.class)
public class OverlayEntry670785546Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__237840722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-237840722L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1441209071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441209071L))
            info.setReturnValue("-\u3CE9P\u7374`\u350C\u92E4m*-T60+\u08C2)\u338F\uAB4BwYh\uAF43\u3F9Bzqffi)nISYyk\u7F16^%q\u385ADoWLg#q\u55C56.no\u0EB3&?&BFQ* s(\u1906rU\uC934bJ7+_X\u8EDFA%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1228137637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228137637L))
            info.setReturnValue(-1251255297);
    }

    @Inject(at = @At("HEAD"), method = "format()Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void format_591423405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591423405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isApplicable(Lnet/minecraft/server/packs/metadata/pack/PackFormat;)Z", cancellable = true)
    private void isApplicable__598509010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598509010L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "overlay()Ljava/lang/String;", cancellable = true)
    private void overlay__1871263773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871263773L))
            info.setReturnValue("DQ6@s}\u7B5F8snUJX>\u39F3h=vZ_'tuL&`ywmc0\u940B[g4:%::i7Rn'ik{R;vjKi1");
    }


}
