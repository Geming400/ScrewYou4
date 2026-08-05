package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.PlayerEnderChestContainer.class)
public class PlayerEnderChestContainer1004438809Mixin {
        @Inject(at = @At("HEAD"), method = "fromSlots(Lnet/minecraft/world/level/storage/ValueInput$TypedInputList;)V", cancellable = true)
    private void fromSlots__206255894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-206255894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeAsSlots(Lnet/minecraft/world/level/storage/ValueOutput$TypedOutputList;)V", cancellable = true)
    private void storeAsSlots__94397476(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-94397476L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setActiveChest(Lnet/minecraft/world/level/block/entity/EnderChestBlockEntity;)V", cancellable = true)
    private void setActiveChest__1802371758(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1802371758L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_336290442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(336290442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1945044299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945044299L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen_336290442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(336290442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActiveChest(Lnet/minecraft/world/level/block/entity/EnderChestBlockEntity;)Z", cancellable = true)
    private void isActiveChest__1802367914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802367914L))
            info.setReturnValue(false);
    }


}
