package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.TransientCraftingContainer.class)
public class TransientCraftingContainer811328775Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_849607358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849607358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__2089720302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089720302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem__874037749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-874037749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillStackedContents(Lnet/minecraft/world/entity/player/StackedItemContents;)V", cancellable = true)
    private void fillStackedContents_2120460592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2120460592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate__2089720302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089720302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_849591021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849591021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_849591021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849591021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1751934265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1751934265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem__533424680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-533424680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems__1857301705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857301705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_849603514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(849603514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_849591021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849591021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_849603514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(849603514L))
            info.cancel();
    }


}
