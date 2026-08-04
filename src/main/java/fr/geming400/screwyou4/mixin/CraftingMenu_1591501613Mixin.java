package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.CraftingMenu.class)
public class CraftingMenu_1591501613Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1762864038(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1762864038L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInputGridSlots()Ljava/util/List;", cancellable = true)
    private void getInputGridSlots__1077128868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1077128868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeBookType()Lnet/minecraft/world/inventory/RecipeBookType;", cancellable = true)
    private void getRecipeBookType__2046307611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046307611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1762860194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1762860194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__1450969643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450969643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResultSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getResultSlot_854593656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854593656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__1829769934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829769934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__1169712442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1169712442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "beginPlacingRecipe()V", cancellable = true)
    private void beginPlacingRecipe_1629776351(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1629776351L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finishPlacingRecipe(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/crafting/RecipeHolder;)V", cancellable = true)
    private void finishPlacingRecipe_1053044611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1053044611L))
            info.cancel();
    }


}
