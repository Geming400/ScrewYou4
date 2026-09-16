package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.PlayerEnderChestContainer.class)
public class PlayerEnderChestContainer1004438809Mixin {
        @Inject(at = @At("HEAD"), method = "fromSlots(Lnet/minecraft/world/level/storage/ValueInput$TypedInputList;)V", cancellable = true)
    private void fromSlots__78447915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-78447915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeAsSlots(Lnet/minecraft/world/level/storage/ValueOutput$TypedOutputList;)V", cancellable = true)
    private void storeAsSlots_1636004830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1636004830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1029472361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1029472361L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isActiveChest(Lnet/minecraft/world/level/block/entity/EnderChestBlockEntity;)Z", cancellable = true)
    private void isActiveChest_2012759717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2012759717L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setActiveChest(Lnet/minecraft/world/level/block/entity/EnderChestBlockEntity;)V", cancellable = true)
    private void setActiveChest__573233959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-573233959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_551510846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(551510846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen__48514146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-48514146L))
            info.cancel();
    }


}
