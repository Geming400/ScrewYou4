package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.LoomMenu.class)
public class LoomMenu647048818Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_1312242496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1312242496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1386862352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386862352L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDyeSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getDyeSlot__300348394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300348394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedBannerPatternIndex()I", cancellable = true)
    private void getSelectedBannerPatternIndex__989412007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989412007L))
            info.setReturnValue(1025160937);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__675779986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-675779986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clickMenuButton(Lnet/minecraft/world/entity/player/Player;I)Z", cancellable = true)
    private void clickMenuButton_1411240096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411240096L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__1094557365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1094557365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResultSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getResultSlot__2043011473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043011473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBannerSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getBannerSlot__827933954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827933954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPatternSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getPatternSlot__634958794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634958794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectablePatterns()Ljava/util/List;", cancellable = true)
    private void getSelectablePatterns__126623119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-126623119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void registerUpdateListener__1546041981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1546041981L))
            info.cancel();
    }


}
