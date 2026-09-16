package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.Slot.class)
public class Slot_1581805232Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void remove_536435638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536435638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void set_579559781(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(579559781L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive__932571754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932571754L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasItem()Z", cancellable = true)
    private void hasItem__1698506823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698506823L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1087639900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087639900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowModification(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void allowModification_1012499644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012499644L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getMaxStackSize_649806079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649806079L))
            info.setReturnValue(-1609479427);
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize()I", cancellable = true)
    private void getMaxStackSize_445558106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(445558106L))
            info.setReturnValue(-48457331);
    }

    @Inject(at = @At("HEAD"), method = "setByPlayer(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setByPlayer_572549165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(572549165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setByPlayer(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setByPlayer_1740566738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1740566738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerSlot()I", cancellable = true)
    private void getContainerSlot__283664436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-283664436L))
            info.setReturnValue(1513068849);
    }

    @Inject(at = @At("HEAD"), method = "onQuickCraft(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onQuickCraft__2138370822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2138370822L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_146157744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(146157744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__1614587351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614587351L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "safeInsert(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeInsert__478210508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-478210508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeInsert(Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeInsert_198668409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(198668409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryRemove(IILnet/minecraft/world/entity/player/Player;)Ljava/util/Optional;", cancellable = true)
    private void tryRemove_1251412353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251412353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTake(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onTake__500598852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-500598852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "safeClone(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeClone_692985928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692985928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayPickup(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void mayPickup_1037782144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037782144L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "safeTake(IILnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeTake_28865292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28865292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoItemIcon()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getNoItemIcon_1464595961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1464595961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHighlightable()Z", cancellable = true)
    private void isHighlightable__1164556318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1164556318L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFake()Z", cancellable = true)
    private void isFake__554157017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554157017L))
            info.setReturnValue(false);
    }


}
