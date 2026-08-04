package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.UserBanList.class)
public class UserBanList_115098444Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove_1500739166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500739166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void remove_920305119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920305119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_153373182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(153373182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/UserBanListEntry;)Z", cancellable = true)
    private void add__104746380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104746380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/StoredUserEntry;)Z", cancellable = true)
    private void add__48322174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-48322174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUserList()[Ljava/lang/String;", cancellable = true)
    private void getUserList_1465131725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1465131725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBanned(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isBanned_920305119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920305119L))
            info.setReturnValue(null);
    }


}
