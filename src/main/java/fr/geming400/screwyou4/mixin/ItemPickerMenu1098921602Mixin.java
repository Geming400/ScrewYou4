package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen.ItemPickerMenu.class)
public class ItemPickerMenu1098921602Mixin {
        @Inject(at = @At("HEAD"), method = "canScroll()Z", cancellable = true)
    private void canScroll_1137200185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137200185L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canDragTo(Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canDragTo__1454611066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454611066L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCarried()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getCarried_1622340262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622340262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCarried(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setCarried__1461514406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1461514406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_2039527092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2039527092L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_1972617352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972617352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__1943549653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943549653L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "scrollTo(F)V", cancellable = true)
    private void scrollTo__1984899285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1984899285L))
            info.cancel();
    }


}
