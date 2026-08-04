package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.StonecutterMenu.class)
public class StonecutterMenu_346089963Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/inventory/MenuType;", cancellable = true)
    private void getType_1866281371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866281371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_1286691608(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286691608L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1286695452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286695452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVisibleRecipes()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void getVisibleRecipes__194072016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194072016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberOfVisibleRecipes()I", cancellable = true)
    private void getNumberOfVisibleRecipes_384352208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384352208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasInputItem()Z", cancellable = true)
    private void hasInputItem_384368545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384368545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedRecipeIndex()I", cancellable = true)
    private void getSelectedRecipeIndex_384352208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384352208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll_1598586003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1598586003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_1219785712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1219785712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clickMenuButton(Lnet/minecraft/world/entity/player/Player;I)Z", cancellable = true)
    private void clickMenuButton__532626177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532626177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged_1879843204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1879843204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerUpdateListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void registerUpdateListener_1802831643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1802831643L))
            info.cancel();
    }


}
