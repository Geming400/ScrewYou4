package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.PackLocationInfo.class)
public class PackLocationInfo2064430392Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__845024645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845024645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_928970417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928970417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2102693134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2102693134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_928969921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928969921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/server/packs/repository/PackSource;", cancellable = true)
    private void source__1399533670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1399533670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void title__112478773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-112478773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knownPackInfo()Ljava/util/Optional;", cancellable = true)
    private void knownPackInfo__1985075482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985075482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createChatLink(ZLnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void createChatLink__364732691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364732691L))
            info.setReturnValue(null);
    }


}
