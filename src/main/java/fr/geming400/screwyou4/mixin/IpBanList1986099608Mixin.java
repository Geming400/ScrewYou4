package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.IpBanList.class)
public class IpBanList1986099608Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/String;)Z", cancellable = true)
    private void remove__1156502695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156502695L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove__923226965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-923226965L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/net/SocketAddress;)Lnet/minecraft/server/players/IpBanListEntry;", cancellable = true)
    private void get_403775112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(403775112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_2024374347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2024374347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/IpBanListEntry;)Z", cancellable = true)
    private void add__641058139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641058139L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/StoredUserEntry;)Z", cancellable = true)
    private void add_1822678991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822678991L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBanned(Ljava/net/SocketAddress;)Z", cancellable = true)
    private void isBanned_630644284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630644284L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBanned(Ljava/lang/String;)Z", cancellable = true)
    private void isBanned__1156502695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156502695L))
            info.setReturnValue(false);
    }


}
