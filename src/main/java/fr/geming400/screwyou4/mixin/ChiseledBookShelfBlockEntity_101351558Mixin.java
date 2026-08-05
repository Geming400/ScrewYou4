package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ChiseledBookShelfBlockEntity.class)
public class ChiseledBookShelfBlockEntity_101351558Mixin {
        @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem__1584014967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584014967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize()I", cancellable = true)
    private void getMaxStackSize_139613803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139613803L))
            info.setReturnValue(839695514);
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem__1243401898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1243401898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag__1117779795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1117779795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canTakeItem(Lnet/minecraft/world/Container;ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canTakeItem__1249287213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249287213L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "acceptsItemType(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void acceptsItemType_1835886689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1835886689L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLastInteractedSlot()I", cancellable = true)
    private void getLastInteractedSlot_139613803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139613803L))
            info.setReturnValue(839695514);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getItems__1068810563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068810563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1041957047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041957047L))
            info.setReturnValue(false);
    }


}
