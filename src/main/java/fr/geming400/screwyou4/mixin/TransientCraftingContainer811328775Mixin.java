package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.TransientCraftingContainer.class)
public class TransientCraftingContainer811328775Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1870445147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1870445147L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__1244435967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244435967L))
            info.setReturnValue(-410654805);
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate_618238577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618238577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__1126567715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126567715L))
            info.setReturnValue(720967456);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__914288400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914288400L))
            info.setReturnValue(-1444327933);
    }

    @Inject(at = @At("HEAD"), method = "fillStackedContents(Lnet/minecraft/world/entity/player/StackedItemContents;)V", cancellable = true)
    private void fillStackedContents__1916683890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1916683890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_727791149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(727791149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged__624318712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-624318712L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1222582395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222582395L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Ljava/util/List;", cancellable = true)
    private void getItems_9304129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9304129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_46176718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(46176718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_724914345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(724914345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem_47001346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47001346L))
            info.setReturnValue(null);
    }


}
