package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.warden.WardenSpawnTracker.class)
public class WardenSpawnTracker897052868Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__832384120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-832384120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_767369210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(767369210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryWarn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/server/level/ServerPlayer;)Ljava/util/OptionalInt;", cancellable = true)
    private static void tryWarn__2138878403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138878403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWarningLevel()I", cancellable = true)
    private void getWarningLevel_453049772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453049772L))
            info.setReturnValue(-204473421);
    }

    @Inject(at = @At("HEAD"), method = "setWarningLevel(I)V", cancellable = true)
    private void setWarningLevel__1713110214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1713110214L))
            info.cancel();
    }


}
