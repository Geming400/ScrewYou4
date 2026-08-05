package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.UserWhiteList.class)
public class UserWhiteList1339253070Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove__1570073503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570073503L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void remove_2144459746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144459746L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1377527809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1377527809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/StoredUserEntry;)Z", cancellable = true)
    private void add_1175832453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175832453L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/UserWhiteListEntry;)Z", cancellable = true)
    private void add__1985297903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985297903L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isWhiteListed(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isWhiteListed_2144459746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144459746L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUserList()[Ljava/lang/String;", cancellable = true)
    private void getUserList__1605680944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605680944L))
            info.setReturnValue(null);
    }


}
