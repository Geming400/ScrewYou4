package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.wanderingtrader.WanderingTrader.class)
public class WanderingTrader906735093Mixin {
        @Inject(at = @At("HEAD"), method = "showProgressBar()Z", cancellable = true)
    private void showProgressBar_945013676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945013676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_945009832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(945009832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDespawnDelay()I", cancellable = true)
    private void getDespawnDelay_944997339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944997339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDespawnDelay(I)V", cancellable = true)
    private void setDespawnDelay_2120652065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2120652065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNotifyTradeSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getNotifyTradeSound_1996947991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996947991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWanderTarget(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setWanderTarget_1075501692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1075501692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getConsumeSound(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getConsumeSound_478675004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478675004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1790572581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790572581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1771406361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771406361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_2116038304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116038304L))
            info.setReturnValue(null);
    }


}
