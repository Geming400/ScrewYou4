package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.wanderingtrader.WanderingTrader.class)
public class WanderingTrader906735093Mixin {
        @Inject(at = @At("HEAD"), method = "setDespawnDelay(I)V", cancellable = true)
    private void setDespawnDelay_58128492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(58128492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDespawnDelay()I", cancellable = true)
    private void getDespawnDelay_935198396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(935198396L))
            info.setReturnValue(1799547123);
    }

    @Inject(at = @At("HEAD"), method = "setWanderTarget(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setWanderTarget_13592220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(13592220L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showProgressBar()Z", cancellable = true)
    private void showProgressBar_226953699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226953699L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1756934636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1756934636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1379076675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379076675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1046490233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1046490233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_248205383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248205383L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNotifyTradeSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getNotifyTradeSound__1096193363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096193363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConsumeSound(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getConsumeSound_1087156595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087156595L))
            info.setReturnValue(null);
    }


}
