package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.InventoryMenu.class)
public class InventoryMenu1844940333Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1784833285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1784833285L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHotbarSlot(I)Z", cancellable = true)
    private static void isHotbarSlot__1676450973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676450973L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeBookType()Lnet/minecraft/world/inventory/RecipeBookType;", cancellable = true)
    private void getRecipeBookType_763310221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763310221L))
            info.setReturnValue(net.minecraft.world.inventory.RecipeBookType.FURNACE);
    }

    @Inject(at = @At("HEAD"), method = "getResultSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getResultSlot__845119958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845119958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInputGridSlots()Ljava/util/List;", cancellable = true)
    private void getInputGridSlots_60305336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60305336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged_103334150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(103334150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__526930443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526930443L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_522111529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(522111529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCraftSlots()Lnet/minecraft/world/inventory/CraftingContainer;", cancellable = true)
    private void getCraftSlots__1228456597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228456597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__188970837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188970837L))
            info.setReturnValue(true);
    }


}
