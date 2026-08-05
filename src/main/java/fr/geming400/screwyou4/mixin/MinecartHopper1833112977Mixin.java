package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartHopper.class)
public class MinecartHopper1833112977Mixin {
        @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_1871391560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871391560L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1871387716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1871387716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setEnabled(Z)V", cancellable = true)
    private void setEnabled__1232237490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1232237490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState__462645889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462645889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelX()D", cancellable = true)
    private void getLevelX_1871370418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871370418L))
            info.setReturnValue(5.945130055836085E7D);
    }

    @Inject(at = @At("HEAD"), method = "getLevelY()D", cancellable = true)
    private void getLevelY_1871370418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871370418L))
            info.setReturnValue(5.945130055836085E7D);
    }

    @Inject(at = @At("HEAD"), method = "getLevelZ()D", cancellable = true)
    private void getLevelZ_1871370418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871370418L))
            info.setReturnValue(5.945130055836085E7D);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult__1938435659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1938435659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_1871375223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871375223L))
            info.setReturnValue(1850474452);
    }

    @Inject(at = @At("HEAD"), method = "suckInItems()Z", cancellable = true)
    private void suckInItems_1871391560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871391560L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isGridAligned()Z", cancellable = true)
    private void isGridAligned_1871391560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871391560L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "activateMinecart(Lnet/minecraft/server/level/ServerLevel;IIIZ)V", cancellable = true)
    private void activateMinecart_1461375846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461375846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayOffset()I", cancellable = true)
    private void getDefaultDisplayOffset_1871375223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871375223L))
            info.setReturnValue(1850474452);
    }

    @Inject(at = @At("HEAD"), method = "createMenu(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void createMenu_925585392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925585392L))
            info.setReturnValue(null);
    }


}
