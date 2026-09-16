package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.CompoundContainer.class)
public class CompoundContainer1594785512Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1641065412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641065412L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/Container;)Z", cancellable = true)
    private void contains__2097752027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097752027L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem_830458083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830458083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1508371082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508371082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__460979230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460979230L))
            info.setReturnValue(-97681026);
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate_1401695314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1401695314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__439125658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-439125658L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize()I", cancellable = true)
    private void getMaxStackSize_458538387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458538387L))
            info.setReturnValue(1183308341);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItem(ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canPlaceItem_1789294855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789294855L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_829633455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(829633455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_1511247886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511247886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_159138025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(159138025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_1141857549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1141857549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen_541832557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(541832557L))
            info.cancel();
    }


}
