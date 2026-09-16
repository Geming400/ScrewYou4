package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMerchantOffersPacket.class)
public class ClientboundMerchantOffersPacket1235745964Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1391613554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391613554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_940034101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(940034101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__355731630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-355731630L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId__1153659380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1153659380L))
            info.setReturnValue(-966299821);
    }

    @Inject(at = @At("HEAD"), method = "getVillagerLevel()I", cancellable = true)
    private void getVillagerLevel__2101831318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101831318L))
            info.setReturnValue(-58398990);
    }

    @Inject(at = @At("HEAD"), method = "showProgress()Z", cancellable = true)
    private void showProgress_2021293145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021293145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canRestock()Z", cancellable = true)
    private void canRestock_1954799472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954799472L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getOffers()Lnet/minecraft/world/item/trading/MerchantOffers;", cancellable = true)
    private void getOffers__320252053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320252053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVillagerXp()I", cancellable = true)
    private void getVillagerXp__2124284866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2124284866L))
            info.setReturnValue(381825954);
    }


}
