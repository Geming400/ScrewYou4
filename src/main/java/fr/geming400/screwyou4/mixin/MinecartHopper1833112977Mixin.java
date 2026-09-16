package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartHopper.class)
public class MinecartHopper1833112977Mixin {
        @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__201035023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201035023L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1703429319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703429319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__222651765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222651765L))
            info.setReturnValue(1164766481);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1888042313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1888042313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMenu(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void createMenu__1609853163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609853163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isGridAligned()Z", cancellable = true)
    private void isGridAligned_2021226260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021226260L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "suckInItems()Z", cancellable = true)
    private void suckInItems_685627895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(685627895L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setEnabled(Z)V", cancellable = true)
    private void setEnabled__1875638899(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1875638899L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevelX()D", cancellable = true)
    private void getLevelX__1249673560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249673560L))
            info.setReturnValue(8.646656007787274E8D);
    }

    @Inject(at = @At("HEAD"), method = "getLevelZ()D", cancellable = true)
    private void getLevelZ__1192415258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192415258L))
            info.setReturnValue(8.646656004820309E8D);
    }

    @Inject(at = @At("HEAD"), method = "getLevelY()D", cancellable = true)
    private void getLevelY__1221044409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221044409L))
            info.setReturnValue(8.64665600438414E8D);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayOffset()I", cancellable = true)
    private void getDefaultDisplayOffset_1803931149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803931149L))
            info.setReturnValue(-1899433844);
    }

    @Inject(at = @At("HEAD"), method = "activateMinecart(Lnet/minecraft/server/level/ServerLevel;IIIZ)V", cancellable = true)
    private void activateMinecart__1445043168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1445043168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState__873504038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873504038L))
            info.setReturnValue(null);
    }


}
