package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.CraftingMenu.class)
public class CraftingMenu_1591501613Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__2038272006(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2038272006L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__442409558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442409558L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_268672808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268672808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__780369164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-780369164L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__150104571(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-150104571L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finishPlacingRecipe(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/crafting/RecipeHolder;)V", cancellable = true)
    private void finishPlacingRecipe_208879364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(208879364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "beginPlacingRecipe()V", cancellable = true)
    private void beginPlacingRecipe_138643190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(138643190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResultSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getResultSlot__1098558679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1098558679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInputGridSlots()Ljava/util/List;", cancellable = true)
    private void getInputGridSlots__193133385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193133385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeBookType()Lnet/minecraft/world/inventory/RecipeBookType;", cancellable = true)
    private void getRecipeBookType_509871500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509871500L))
            info.setReturnValue(net.minecraft.world.inventory.RecipeBookType.SMOKER);
    }


}
