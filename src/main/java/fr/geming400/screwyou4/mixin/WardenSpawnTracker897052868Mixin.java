package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.warden.WardenSpawnTracker.class)
public class WardenSpawnTracker897052868Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_935327607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(935327607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_935327607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(935327607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryWarn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/server/level/ServerPlayer;)Ljava/util/OptionalInt;", cancellable = true)
    private static void tryWarn__397999106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-397999106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWarningLevel(I)V", cancellable = true)
    private void setWarningLevel_2110969840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2110969840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWarningLevel()I", cancellable = true)
    private void getWarningLevel_935315114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(935315114L))
            info.setReturnValue(1220238163);
    }


}
