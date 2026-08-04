package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.LoomMenu.class)
public class LoomMenu647048818Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_1587650464(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1587650464L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectedBannerPatternIndex()I", cancellable = true)
    private void getSelectedBannerPatternIndex_685311064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(685311064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1587654308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587654308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDyeSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getDyeSlot__89859138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89859138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResultSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getResultSlot__89859138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89859138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_1520744568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1520744568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clickMenuButton(Lnet/minecraft/world/entity/player/Player;I)Z", cancellable = true)
    private void clickMenuButton__231667321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231667321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__2114165236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2114165236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPatternSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getPatternSlot__89859138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89859138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void registerUpdateListener_2103790499(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2103790499L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectablePatterns()Ljava/util/List;", cancellable = true)
    private void getSelectablePatterns__2021581662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021581662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBannerSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getBannerSlot__89859138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89859138L))
            info.setReturnValue(null);
    }


}
