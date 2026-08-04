package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.Pufferfish.class)
public class Pufferfish751423838Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_789698577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(789698577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_1274842498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274842498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerTouch(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void playerTouch_1692025484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1692025484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPuffState()I", cancellable = true)
    private void getPuffState_789686084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789686084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_789698577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(789698577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1897794014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1897794014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__491222206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491222206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPuffState(I)V", cancellable = true)
    private void setPuffState_1965340810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1965340810L))
            info.cancel();
    }


}
