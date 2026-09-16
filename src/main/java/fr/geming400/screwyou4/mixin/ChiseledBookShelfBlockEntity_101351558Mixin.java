package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ChiseledBookShelfBlockEntity.class)
public class ChiseledBookShelfBlockEntity_101351558Mixin {
        @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1932559613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1932559613L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItem(Lnet/minecraft/world/Container;ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canTakeItem__2092095767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092095767L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_17813931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(17813931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize()I", cancellable = true)
    private void getMaxStackSize__1034895568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034895568L))
            info.setReturnValue(1890582943);
    }

    @Inject(at = @At("HEAD"), method = "getLastInteractedSlot()I", cancellable = true)
    private void getLastInteractedSlot_2072598188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2072598188L))
            info.setReturnValue(1564122733);
    }

    @Inject(at = @At("HEAD"), method = "acceptsItemType(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void acceptsItemType_1570708713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570708713L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getItems_524685255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524685255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag__11476701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-11476701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem__662975872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662975872L))
            info.setReturnValue(null);
    }


}
