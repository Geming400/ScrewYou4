package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.MerchantMenu.class)
public class MerchantMenu_1251981223Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_1917174900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1917174900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showProgressBar()Z", cancellable = true)
    private void showProgressBar_572199828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572199828L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__781929948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781929948L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canRestock()Z", cancellable = true)
    private void canRestock_1971034730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971034730L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tryMoveItems(I)V", cancellable = true)
    private void tryMoveItems__1038405946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1038405946L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__70847582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-70847582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__1119889554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119889554L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__489624961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-489624961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOffers()Lnet/minecraft/world/item/trading/MerchantOffers;", cancellable = true)
    private void getOffers__304016795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304016795L))
            info.setReturnValue(new net.minecraft.world.item.trading.MerchantOffers());
    }

    @Inject(at = @At("HEAD"), method = "setOffers(Lnet/minecraft/world/item/trading/MerchantOffers;)V", cancellable = true)
    private void setOffers__135182735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-135182735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMerchantLevel(I)V", cancellable = true)
    private void setMerchantLevel__940534612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-940534612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setShowProgressBar(Z)V", cancellable = true)
    private void setShowProgressBar_1088304074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1088304074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCanRestock(Z)V", cancellable = true)
    private void setCanRestock__911933576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-911933576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTraderXp()I", cancellable = true)
    private void getTraderXp_295876208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295876208L))
            info.setReturnValue(-122680118);
    }

    @Inject(at = @At("HEAD"), method = "setSelectionHint(I)V", cancellable = true)
    private void setSelectionHint__1930582269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1930582269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFutureTraderXp()I", cancellable = true)
    private void getFutureTraderXp_1769614829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769614829L))
            info.setReturnValue(1243065285);
    }

    @Inject(at = @At("HEAD"), method = "getTraderLevel()I", cancellable = true)
    private void getTraderLevel__1016305108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016305108L))
            info.setReturnValue(1159799654);
    }

    @Inject(at = @At("HEAD"), method = "setXp(I)V", cancellable = true)
    private void setXp__539741620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-539741620L))
            info.cancel();
    }


}
