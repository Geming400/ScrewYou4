package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.MerchantContainer.class)
public class MerchantContainer1368986987Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1866863937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866863937L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1282572557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1282572557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__686777755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-686777755L))
            info.setReturnValue(1514511815);
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate_1175896789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175896789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__664924183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664924183L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSelectionHint(I)V", cancellable = true)
    private void setSelectionHint__1813576504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1813576504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSellItem()V", cancellable = true)
    private void updateSellItem_1351174000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351174000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFutureXp()I", cancellable = true)
    private void getFutureXp__1419064224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419064224L))
            info.setReturnValue(-1458692553);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_603834930(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(603834930L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_1285449361(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1285449361L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged__66660500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-66660500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getActiveOffer()Lnet/minecraft/world/item/trading/MerchantOffer;", cancellable = true)
    private void getActiveOffer_887253982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887253982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem_604659558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604659558L))
            info.setReturnValue(null);
    }


}
