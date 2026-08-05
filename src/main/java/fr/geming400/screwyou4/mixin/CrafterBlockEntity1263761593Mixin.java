package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CrafterBlockEntity.class)
public class CrafterBlockEntity1263761593Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1302040176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302040176L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__1637287484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637287484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getItems_93599473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(93599473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems__1404739927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404739927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__2090600213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090600213L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_1302023839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302023839L))
            info.setReturnValue(827239064);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_1302023839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302023839L))
            info.setReturnValue(827239064);
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem__80991862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-80991862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_1302023839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302023839L))
            info.setReturnValue(827239064);
    }

    @Inject(at = @At("HEAD"), method = "fillStackedContents(Lnet/minecraft/world/entity/player/StackedItemContents;)V", cancellable = true)
    private void fillStackedContents__1722073886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1722073886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTriggered()Z", cancellable = true)
    private void isTriggered_1302040176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302040176L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItem(ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canPlaceItem__80988018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-80988018L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRedstoneSignal()I", cancellable = true)
    private void getRedstoneSignal_1302023839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302023839L))
            info.setReturnValue(827239064);
    }

    @Inject(at = @At("HEAD"), method = "setCraftingTicksRemaining(I)V", cancellable = true)
    private void setCraftingTicksRemaining__1817288731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1817288731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTriggered(Z)V", cancellable = true)
    private void setTriggered__1801588874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1801588874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSlotState(IZ)V", cancellable = true)
    private void setSlotState_283581981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(283581981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSlotDisabled(I)Z", cancellable = true)
    private void isSlotDisabled__1817284887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817284887L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/CrafterBlockEntity;)V", cancellable = true)
    private static void serverTick_2085773334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2085773334L))
            info.cancel();
    }


}
