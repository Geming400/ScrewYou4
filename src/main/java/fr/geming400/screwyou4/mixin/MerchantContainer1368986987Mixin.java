package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.MerchantContainer.class)
public class MerchantContainer1368986987Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1407265570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407265570L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__1532062090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1532062090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem__316379537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316379537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSellItem()V", cancellable = true)
    private void updateSellItem_1407261726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1407261726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFutureXp()I", cancellable = true)
    private void getFutureXp_1407249233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407249233L))
            info.setReturnValue(-253337419);
    }

    @Inject(at = @At("HEAD"), method = "setSelectionHint(I)V", cancellable = true)
    private void setSelectionHint__1712063337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1712063337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_24233532(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(24233532L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate__1532062090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1532062090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_1407249233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407249233L))
            info.setReturnValue(-253337419);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_1407261726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1407261726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_1407261726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1407261726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1985374819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985374819L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getActiveOffer()Lnet/minecraft/world/item/trading/MerchantOffer;", cancellable = true)
    private void getActiveOffer_1620141598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620141598L))
            info.setReturnValue(null);
    }


}
