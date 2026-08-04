package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.ClientSideMerchant.class)
public class ClientSideMerchant_708748464Mixin {
        @Inject(at = @At("HEAD"), method = "showProgressBar()Z", cancellable = true)
    private void showProgressBar_747027046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747027046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOffers()Lnet/minecraft/world/item/trading/MerchantOffers;", cancellable = true)
    private void getOffers__94562853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94562853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isClientSide()Z", cancellable = true)
    private void isClientSide_747027046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747027046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1649353953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649353953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVillagerXp()I", cancellable = true)
    private void getVillagerXp_747010709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747010709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideXp(I)V", cancellable = true)
    private void overrideXp_1922665435(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1922665435L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTradingPlayer(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void setTradingPlayer_1649350109(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649350109L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNotifyTradeSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getNotifyTradeSound_1798961361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798961361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideOffers(Lnet/minecraft/world/item/trading/MerchantOffers;)V", cancellable = true)
    private void overrideOffers__610551903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-610551903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "notifyTrade(Lnet/minecraft/world/item/trading/MerchantOffer;)V", cancellable = true)
    private void notifyTrade__1187108906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1187108906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "notifyTradeUpdated(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void notifyTradeUpdated__1851687545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1851687545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTradingPlayer()Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void getTradingPlayer__338337815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-338337815L))
            info.setReturnValue(null);
    }


}
