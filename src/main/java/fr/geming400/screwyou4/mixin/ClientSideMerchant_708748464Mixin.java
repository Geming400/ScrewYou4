package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.ClientSideMerchant.class)
public class ClientSideMerchant_708748464Mixin {
        @Inject(at = @At("HEAD"), method = "isClientSide()Z", cancellable = true)
    private void isClientSide__253014694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253014694L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showProgressBar()Z", cancellable = true)
    private void showProgressBar_28967069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28967069L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1325162707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325162707L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVillagerXp()I", cancellable = true)
    private void getVillagerXp_1643684929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643684929L))
            info.setReturnValue(831043287);
    }

    @Inject(at = @At("HEAD"), method = "setTradingPlayer(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void setTradingPlayer__565428291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-565428291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTradingPlayer()Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void getTradingPlayer_363740821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363740821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notifyTradeUpdated(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void notifyTradeUpdated_155974887(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(155974887L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNotifyTradeSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getNotifyTradeSound__1294179993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1294179993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideOffers(Lnet/minecraft/world/item/trading/MerchantOffers;)V", cancellable = true)
    private void overrideOffers__1125546012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1125546012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "notifyTrade(Lnet/minecraft/world/item/trading/MerchantOffer;)V", cancellable = true)
    private void notifyTrade_1966711579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1966711579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOffers()Lnet/minecraft/world/item/trading/MerchantOffers;", cancellable = true)
    private void getOffers__847249554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-847249554L))
            info.setReturnValue(new net.minecraft.world.item.trading.MerchantOffers());
    }

    @Inject(at = @At("HEAD"), method = "overrideXp(I)V", cancellable = true)
    private void overrideXp_1133475007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1133475007L))
            info.cancel();
    }


}
