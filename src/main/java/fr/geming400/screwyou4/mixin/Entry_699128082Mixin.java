package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerLinks.Entry.class)
public class Entry_699128082Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void type__1608701010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1608701010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__209498187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-209498187L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1469551606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469551606L))
            info.setReturnValue("V%FWQJTCvk)U/6zX\u884A zgOlslZ$\u5BF6MwC\u8CF3u'eVLUQQg&-\uD5246GNb;>s \u1EBF!V\uCB5F\u5B6F\uA3D1)\u4FA5\uABA94=(\"@\u3ABE1\uD2F7\u513CTQ\u6ACA#bN0o\"v\uC694HAj:v:D{n\uD5AD|x5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1256480172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256480172L))
            info.setReturnValue(-808679909);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayName_2009552849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009552849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "link()Ljava/net/URI;", cancellable = true)
    private void link__83595348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-83595348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "custom(Lnet/minecraft/network/chat/Component;Ljava/net/URI;)Lnet/minecraft/server/ServerLinks$Entry;", cancellable = true)
    private static void custom__1831769434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1831769434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownType(Lnet/minecraft/server/ServerLinks$KnownLinkType;Ljava/net/URI;)Lnet/minecraft/server/ServerLinks$Entry;", cancellable = true)
    private static void knownType__797866392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797866392L))
            info.setReturnValue(null);
    }


}
