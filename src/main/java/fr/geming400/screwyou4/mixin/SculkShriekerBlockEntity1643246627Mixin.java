package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SculkShriekerBlockEntity.class)
public class SculkShriekerBlockEntity1643246627Mixin {
        @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Listener;", cancellable = true)
    private void getListener_439992539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439992539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/GameEventListener;", cancellable = true)
    private void getListener_2142480580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142480580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryShriek(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void tryShriek__1249986750(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1249986750L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryRespond(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void tryRespond__275994483(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-275994483L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects_1043100925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1043100925L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void getVibrationUser_789075175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789075175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationData()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Data;", cancellable = true)
    private void getVibrationData_539963305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(539963305L))
            info.setReturnValue(new net.minecraft.world.level.gameevent.vibrations.VibrationSystem.Data());
    }

    @Inject(at = @At("HEAD"), method = "tryGetPlayer(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private static void tryGetPlayer_1034449613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034449613L))
            info.setReturnValue(null);
    }


}
