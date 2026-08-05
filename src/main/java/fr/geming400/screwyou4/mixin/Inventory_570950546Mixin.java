package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.Inventory.class)
public class Inventory_570950546Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_62887397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62887397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/world/level/storage/ValueInput$TypedInputList;)V", cancellable = true)
    private void load__1742390584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1742390584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1630066917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630066917L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void add__703144980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703144980L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "add(ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void add_447931079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447931079L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void contains_1302045742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302045742L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void contains_500158871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500158871L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void contains__1466941864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466941864L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/world/level/storage/ValueOutput$TypedOutputList;)V", cancellable = true)
    private void save__398365359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-398365359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceWith(Lnet/minecraft/world/entity/player/Inventory;)V", cancellable = true)
    private void replaceWith_1033104716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1033104716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_441266887(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(441266887L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelectedItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void setSelectedItem__760298176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760298176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isUsableForCrafting(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void isUsableForCrafting_677657852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677657852L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSlotWithRemainingSpace(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getSlotWithRemainingSpace__46214606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46214606L))
            info.setReturnValue(251259893);
    }

    @Inject(at = @At("HEAD"), method = "findSlotMatchingItem(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void findSlotMatchingItem__2091268651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091268651L))
            info.setReturnValue(412436651);
    }

    @Inject(at = @At("HEAD"), method = "getTimesChanged()I", cancellable = true)
    private void getTimesChanged_667889907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667889907L))
            info.setReturnValue(1390037904);
    }

    @Inject(at = @At("HEAD"), method = "isHotbarSlot(I)Z", cancellable = true)
    private static void isHotbarSlot_1344526535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344526535L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSelectionSize()I", cancellable = true)
    private static void getSelectionSize__1616256808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616256808L))
            info.setReturnValue(-43378150);
    }

    @Inject(at = @At("HEAD"), method = "clearOrCountMatchingItems(Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I", cancellable = true)
    private void clearOrCountMatchingItems_482908592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482908592L))
            info.setReturnValue(1324687610);
    }

    @Inject(at = @At("HEAD"), method = "getSuitableHotbarSlot()I", cancellable = true)
    private void getSuitableHotbarSlot_536310550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536310550L))
            info.setReturnValue(178495299);
    }

    @Inject(at = @At("HEAD"), method = "getFreeSlot()I", cancellable = true)
    private void getFreeSlot_287882615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(287882615L))
            info.setReturnValue(-756641984);
    }

    @Inject(at = @At("HEAD"), method = "addAndPickItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void addAndPickItem_642112831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(642112831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectedSlot()I", cancellable = true)
    private void getSelectedSlot_914026792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(914026792L))
            info.setReturnValue(1486573887);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__1484814197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484814197L))
            info.setReturnValue(531632196);
    }

    @Inject(at = @At("HEAD"), method = "setSelectedSlot(I)V", cancellable = true)
    private void setSelectedSlot_885410616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(885410616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate_377860347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377860347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getSelectedItem__546284935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-546284935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNonEquipmentItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getNonEquipmentItems__724631662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724631662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillStackedContents(Lnet/minecraft/world/entity/player/StackedItemContents;)V", cancellable = true)
    private void fillStackedContents_2137905176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2137905176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeItemBackInInventory(Lnet/minecraft/world/item/ItemStack;Z)V", cancellable = true)
    private void placeItemBackInInventory_1713556351(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1713556351L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeItemBackInInventory(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void placeItemBackInInventory__1333244173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1333244173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropAll()V", cancellable = true)
    private void dropAll__1494376110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1494376110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_487412919(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(487412919L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFromSelected(Z)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeFromSelected_937227906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937227906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged__864696942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-864696942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1462960625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462960625L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createInventoryUpdatePacket(I)Lnet/minecraft/network/protocol/game/ClientboundSetPlayerInventoryPacket;", cancellable = true)
    private void createInventoryUpdatePacket_1777278374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777278374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findSlotMatchingCraftingIngredient(Lnet/minecraft/core/Holder;Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void findSlotMatchingCraftingIngredient__1035095758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1035095758L))
            info.setReturnValue(-1227933287);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent__194201512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-194201512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pickSlot(I)V", cancellable = true)
    private void pickSlot_135677244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(135677244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_484536115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484536115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void removeItem_672624786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(672624786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem__193376884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193376884L))
            info.setReturnValue(null);
    }


}
