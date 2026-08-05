package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.UserBanList.class)
public class UserBanList_115098444Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove_1360996698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1360996698L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void remove__777532453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777532453L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__670729263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-670729263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/UserBanListEntry;)Z", cancellable = true)
    private void add_6343829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(6343829L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/StoredUserEntry;)Z", cancellable = true)
    private void add__183285951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183285951L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUserList()[Ljava/lang/String;", cancellable = true)
    private void getUserList_1814532974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814532974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBanned(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isBanned_628532727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628532727L))
            info.setReturnValue(false);
    }


}
