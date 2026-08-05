package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.Inventory.class)
public class Inventory_570950546Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__1605958620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605958620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/world/level/storage/ValueInput$TypedInputList;)V", cancellable = true)
    private void load__639744158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-639744158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_609229128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609229128L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void add__1989481619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989481619L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "add(ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void add__773799066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773799066L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void contains_641310935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641310935L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void contains__2049271944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2049271944L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void contains__1989481619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989481619L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/world/level/storage/ValueOutput$TypedOutputList;)V", cancellable = true)
    private void save__527885740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-527885740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceWith(Lnet/minecraft/world/entity/player/Inventory;)V", cancellable = true)
    private void replaceWith_196078130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(196078130L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_609225284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(609225284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1964868764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964868764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void removeItem__1989485463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1989485463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem__1114415979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1114415979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearOrCountMatchingItems(Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I", cancellable = true)
    private void clearOrCountMatchingItems__1184766380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1184766380L))
            info.setReturnValue(-1125999188);
    }

    @Inject(at = @At("HEAD"), method = "getSlotWithRemainingSpace(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getSlotWithRemainingSpace__1989497956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989497956L))
            info.setReturnValue(-1639515067);
    }

    @Inject(at = @At("HEAD"), method = "addAndPickItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void addAndPickItem__1989485463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1989485463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFreeSlot()I", cancellable = true)
    private void getFreeSlot_609212791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609212791L))
            info.setReturnValue(1164201999);
    }

    @Inject(at = @At("HEAD"), method = "isHotbarSlot(I)Z", cancellable = true)
    private static void isHotbarSlot_1784871609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784871609L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isUsableForCrafting(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void isUsableForCrafting__1989481371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989481371L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setSelectedItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void setSelectedItem_524407664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524407664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSuitableHotbarSlot()I", cancellable = true)
    private void getSuitableHotbarSlot_609212791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609212791L))
            info.setReturnValue(1164201999);
    }

    @Inject(at = @At("HEAD"), method = "getSelectionSize()I", cancellable = true)
    private static void getSelectionSize_609213039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609213039L))
            info.setReturnValue(859480870);
    }

    @Inject(at = @At("HEAD"), method = "findSlotMatchingItem(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void findSlotMatchingItem__1989497956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989497956L))
            info.setReturnValue(-1639515067);
    }

    @Inject(at = @At("HEAD"), method = "getTimesChanged()I", cancellable = true)
    private void getTimesChanged_609212791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609212791L))
            info.setReturnValue(1164201999);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_609225284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(609225284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropAll()V", cancellable = true)
    private void dropAll_609225284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(609225284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem__773802910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-773802910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectedSlot()I", cancellable = true)
    private void getSelectedSlot_609212791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609212791L))
            info.setReturnValue(1164201999);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_609212791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609212791L))
            info.setReturnValue(1164201999);
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate_1964868764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964868764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSelectedSlot(I)V", cancellable = true)
    private void setSelectedSlot_1784867517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1784867517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getSelectedItem_1094369205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094369205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNonEquipmentItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getNonEquipmentItems__599211575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599211575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pickSlot(I)V", cancellable = true)
    private void pickSlot_1784867517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1784867517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_609225284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(609225284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFromSelected(Z)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeFromSelected_1041924971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041924971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeItemBackInInventory(Lnet/minecraft/world/item/ItemStack;Z)V", cancellable = true)
    private void placeItemBackInInventory__1450054455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1450054455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeItemBackInInventory(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void placeItemBackInInventory__1989485463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1989485463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillStackedContents(Lnet/minecraft/world/entity/player/StackedItemContents;)V", cancellable = true)
    private void fillStackedContents_1880082362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880082362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1511556035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511556035L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createInventoryUpdatePacket(I)Lnet/minecraft/network/protocol/game/ClientboundSetPlayerInventoryPacket;", cancellable = true)
    private void createInventoryUpdatePacket_514316501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(514316501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findSlotMatchingCraftingIngredient(Lnet/minecraft/core/Holder;Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void findSlotMatchingCraftingIngredient_1137213419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137213419L))
            info.setReturnValue(-1325286417);
    }


}
