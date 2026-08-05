package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerLinks.Entry.class)
public class Entry_699128082Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void type_1522403368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1522403368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2084640340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084640340L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__436331894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436331894L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_737390823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737390823L))
            info.setReturnValue(904661039);
    }

    @Inject(at = @At("HEAD"), method = "displayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void displayName__1477781084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477781084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "link()Ljava/net/URI;", cancellable = true)
    private void link__1843656142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843656142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownType(Lnet/minecraft/server/ServerLinks$KnownLinkType;Ljava/net/URI;)Lnet/minecraft/server/ServerLinks$Entry;", cancellable = true)
    private static void knownType_1208972683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1208972683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "custom(Lnet/minecraft/network/chat/Component;Ljava/net/URI;)Lnet/minecraft/server/ServerLinks$Entry;", cancellable = true)
    private static void custom__501159115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501159115L))
            info.setReturnValue(null);
    }


}
