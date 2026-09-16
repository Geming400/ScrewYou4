package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.Pufferfish.class)
public class Pufferfish751423838Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_621740180(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(621740180L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1912245891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1912245891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerTouch(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void playerTouch_703310318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(703310318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1746635130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746635130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1458158186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1458158186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPuffState()I", cancellable = true)
    private void getPuffState__1203041874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203041874L))
            info.setReturnValue(-366464026);
    }

    @Inject(at = @At("HEAD"), method = "setPuffState(I)V", cancellable = true)
    private void setPuffState_1240349908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1240349908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_955772599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955772599L))
            info.setReturnValue(null);
    }


}
