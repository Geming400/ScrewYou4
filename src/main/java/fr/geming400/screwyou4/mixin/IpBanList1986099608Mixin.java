package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.IpBanList.class)
public class IpBanList1986099608Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/String;)Z", cancellable = true)
    private void remove__1296245163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296245163L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove__1062969433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062969433L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/net/SocketAddress;)Lnet/minecraft/server/players/IpBanListEntry;", cancellable = true)
    private void get_239869938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(239869938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1200271902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1200271902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/IpBanListEntry;)Z", cancellable = true)
    private void add__1476695802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476695802L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/StoredUserEntry;)Z", cancellable = true)
    private void add_1687715214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687715214L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBanned(Ljava/net/SocketAddress;)Z", cancellable = true)
    private void isBanned_896923220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896923220L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBanned(Ljava/lang/String;)Z", cancellable = true)
    private void isBanned__2050345615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2050345615L))
            info.setReturnValue(true);
    }


}
