package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMerchantOffersPacket.class)
public class ClientboundMerchantOffersPacket1235745964Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__443279124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443279124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1913814877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913814877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1433253498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1433253498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canRestock()Z", cancellable = true)
    private void canRestock_1274024547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274024547L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showProgress()Z", cancellable = true)
    private void showProgress_1274024547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274024547L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVillagerLevel()I", cancellable = true)
    private void getVillagerLevel_1274008210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274008210L))
            info.setReturnValue(1282145582);
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId_1274008210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274008210L))
            info.setReturnValue(1282145582);
    }

    @Inject(at = @At("HEAD"), method = "getOffers()Lnet/minecraft/world/item/trading/MerchantOffers;", cancellable = true)
    private void getOffers_432434648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432434648L))
            info.setReturnValue(new net.minecraft.world.item.trading.MerchantOffers());
    }

    @Inject(at = @At("HEAD"), method = "getVillagerXp()I", cancellable = true)
    private void getVillagerXp_1274008210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274008210L))
            info.setReturnValue(1282145582);
    }


}
