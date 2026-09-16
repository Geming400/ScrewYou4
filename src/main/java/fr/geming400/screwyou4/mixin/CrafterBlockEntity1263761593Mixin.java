package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CrafterBlockEntity.class)
public class CrafterBlockEntity1263761593Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1972089331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972089331L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1177347163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177347163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__792003149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-792003149L))
            info.setReturnValue(1567836739);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__770149577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770149577L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__461855582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-461855582L))
            info.setReturnValue(-1015607214);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__674134897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-674134897L))
            info.setReturnValue(1697057962);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/CrafterBlockEntity;)V", cancellable = true)
    private static void serverTick__1823474794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1823474794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTriggered()Z", cancellable = true)
    private void isTriggered_659316803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659316803L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItem(ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canPlaceItem_1458270936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458270936L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fillStackedContents(Lnet/minecraft/world/entity/player/StackedItemContents;)V", cancellable = true)
    private void fillStackedContents__1464251072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1464251072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSlotState(IZ)V", cancellable = true)
    private void setSlotState_1296265740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1296265740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTriggered(Z)V", cancellable = true)
    private void setTriggered__579186229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-579186229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCraftingTicksRemaining(I)V", cancellable = true)
    private void setCraftingTicksRemaining__341400983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-341400983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSlotDisabled(I)Z", cancellable = true)
    private void isSlotDisabled__1441214259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1441214259L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_1180223967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1180223967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRedstoneSignal()I", cancellable = true)
    private void getRedstoneSignal_1378552493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378552493L))
            info.setReturnValue(-623369428);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems_461865907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461865907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getItems_1687095291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687095291L))
            info.setReturnValue(null);
    }


}
