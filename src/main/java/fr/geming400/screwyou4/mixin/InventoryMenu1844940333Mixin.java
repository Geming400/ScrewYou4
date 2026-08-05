package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.InventoryMenu.class)
public class InventoryMenu1844940333Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1509425317(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1509425317L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1509421473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1509421473L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__1576331213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576331213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__1197530922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197530922L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__916273721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-916273721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResultSlot()Lnet/minecraft/world/inventory/Slot;", cancellable = true)
    private void getResultSlot_1108032377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108032377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInputGridSlots()Ljava/util/List;", cancellable = true)
    private void getInputGridSlots__823690147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823690147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeBookType()Lnet/minecraft/world/inventory/RecipeBookType;", cancellable = true)
    private void getRecipeBookType__1792868890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792868890L))
            info.setReturnValue(net.minecraft.world.inventory.RecipeBookType.CRAFTING);
    }

    @Inject(at = @At("HEAD"), method = "getCraftSlots()Lnet/minecraft/world/inventory/CraftingContainer;", cancellable = true)
    private void getCraftSlots_635678838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635678838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHotbarSlot(I)Z", cancellable = true)
    private static void isHotbarSlot__1236105899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236105899L))
            info.setReturnValue(true);
    }


}
