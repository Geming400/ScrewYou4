package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.Slot.class)
public class Slot_1581805232Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void remove__1319243846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1319243846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void set__978630777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-978630777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive_1620083814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620083814L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasItem()Z", cancellable = true)
    private void hasItem_1620083814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620083814L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_2105223891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105223891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHighlightable()Z", cancellable = true)
    private void isHighlightable_1620083814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620083814L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getNoItemIcon()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getNoItemIcon__861261322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861261322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFake()Z", cancellable = true)
    private void isFake_1620083814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620083814L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize()I", cancellable = true)
    private void getMaxStackSize_1620067477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620067477L))
            info.setReturnValue(1026786088);
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getMaxStackSize__978643270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978643270L))
            info.setReturnValue(569104706);
    }

    @Inject(at = @At("HEAD"), method = "allowModification(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void allowModification__1772556575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772556575L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setByPlayer(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setByPlayer__978630777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-978630777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setByPlayer(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setByPlayer__1467569364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1467569364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerSlot()I", cancellable = true)
    private void getContainerSlot_1620067477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620067477L))
            info.setReturnValue(1026786088);
    }

    @Inject(at = @At("HEAD"), method = "onQuickCraft(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onQuickCraft__1467569364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1467569364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "safeTake(IILnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeTake_1098980184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098980184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeClone(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeClone_980063864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(980063864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTake(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onTake__1498853246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1498853246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryRemove(IILnet/minecraft/world/entity/player/Player;)Ljava/util/Optional;", cancellable = true)
    private void tryRemove__1423738142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1423738142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeInsert(Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeInsert__1808182433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808182433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeInsert(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeInsert_1535262350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535262350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__978626933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978626933L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mayPickup(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void mayPickup__1772556575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772556575L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_1620079970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1620079970L))
            info.cancel();
    }


}
