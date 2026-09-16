package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.UserWhiteList.class)
public class UserWhiteList1339253070Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void remove_446622174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446622174L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove__1709815971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709815971L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_553425364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(553425364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/UserWhiteListEntry;)Z", cancellable = true)
    private void add_1693177842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693177842L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/StoredUserEntry;)Z", cancellable = true)
    private void add_1040868676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040868676L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isWhiteListed(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isWhiteListed_520445350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520445350L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUserList()[Ljava/lang/String;", cancellable = true)
    private void getUserList__1256279695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1256279695L))
            info.setReturnValue(null);
    }


}
