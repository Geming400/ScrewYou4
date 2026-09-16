package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.DiscoveryService.DiscoverInfo.class)
public class DiscoverInfo1188225440Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_279599172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279599172L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1958648965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958648965L))
            info.setReturnValue("'\u0759PxRXq|g<u!/\u3C27\uBA94|XMgOGBZfy..\u5E06\uD234{AQw_}KupZS\uB53E\u357Dhu");
    }

    @Inject(at = @At("HEAD"), method = "version()Ljava/lang/String;", cancellable = true)
    private void version__923366399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-923366399L))
            info.setReturnValue("?*x\"5^Uw$\u1006AxMe2^ ! $><x&\u7408C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1745577531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745577531L))
            info.setReturnValue(563997458);
    }

    @Inject(at = @At("HEAD"), method = "title()Ljava/lang/String;", cancellable = true)
    private void title_975204737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975204737L))
            info.setReturnValue("m[p\u0D56>r1 !\u4B3D\u8804/}\u44EBVL* ZG\uA113)H6Ag]cR>\uA7443A:\"f5'4\u711CRNkS,QPBhF\u844D#?h s\u2830Z)i1b\uB0B7a'B|6i\u0255tVY[c:\u89B3");
    }


}
