package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.MerchantMenu.class)
public class MerchantMenu_1251981223Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__2102384428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2102384428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOffers()Lnet/minecraft/world/item/trading/MerchantOffers;", cancellable = true)
    private void getOffers_448669906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448669906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOffers(Lnet/minecraft/world/item/trading/MerchantOffers;)V", cancellable = true)
    private void setOffers__67319144(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-67319144L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryMoveItems(I)V", cancellable = true)
    private void tryMoveItems__1829069102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1829069102L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__2102380584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2102380584L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canRestock()Z", cancellable = true)
    private void canRestock_1290259805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290259805L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showProgressBar()Z", cancellable = true)
    private void showProgressBar_1290259805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290259805L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__1790490033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790490033L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_2125676972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125676972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__1509232832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1509232832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setXp(I)V", cancellable = true)
    private void setXp__1829069102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1829069102L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelectionHint(I)V", cancellable = true)
    private void setSelectionHint__1829069102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1829069102L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFutureTraderXp()I", cancellable = true)
    private void getFutureTraderXp_1290243468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290243468L))
            info.setReturnValue(-1196304331);
    }

    @Inject(at = @At("HEAD"), method = "getTraderLevel()I", cancellable = true)
    private void getTraderLevel_1290243468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290243468L))
            info.setReturnValue(-1196304331);
    }

    @Inject(at = @At("HEAD"), method = "setCanRestock(Z)V", cancellable = true)
    private void setCanRestock__1813369245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1813369245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setShowProgressBar(Z)V", cancellable = true)
    private void setShowProgressBar__1813369245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1813369245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMerchantLevel(I)V", cancellable = true)
    private void setMerchantLevel__1829069102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1829069102L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTraderXp()I", cancellable = true)
    private void getTraderXp_1290243468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290243468L))
            info.setReturnValue(-1196304331);
    }


}
