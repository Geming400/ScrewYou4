package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.CompoundContainer.class)
public class CompoundContainer1594785512Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1633064095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633064095L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/Container;)Z", cancellable = true)
    private void contains__1166424698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1166424698L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__1306263565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1306263565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem__90581012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-90581012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItem(ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canPlaceItem_250035901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250035901L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_1633060251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1633060251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_250032057(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(250032057L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize()I", cancellable = true)
    private void getMaxStackSize_1633047758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633047758L))
            info.setReturnValue(1576147800);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_1633047758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633047758L))
            info.setReturnValue(1576147800);
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate__1306263565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1306263565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_1633060251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1633060251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1759576294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759576294L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_926637145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(926637145L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen_926637145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(926637145L))
            info.cancel();
    }


}
