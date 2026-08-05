package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SculkShriekerBlockEntity.class)
public class SculkShriekerBlockEntity1643246627Mixin {
        @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/GameEventListener;", cancellable = true)
    private void getListener__2114679506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2114679506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Listener;", cancellable = true)
    private void getListener__199876923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199876923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryRespond(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void tryRespond_664837287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(664837287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryShriek(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void tryShriek__1418314635(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1418314635L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects__875462951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-875462951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVibrationData()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Data;", cancellable = true)
    private void getVibrationData__2043871601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043871601L))
            info.setReturnValue(new net.minecraft.world.level.gameevent.vibrations.VibrationSystem$Data());
    }

    @Inject(at = @At("HEAD"), method = "getVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void getVibrationUser_660767438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660767438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryGetPlayer(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private static void tryGetPlayer_1050979441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050979441L))
            info.setReturnValue(null);
    }


}
