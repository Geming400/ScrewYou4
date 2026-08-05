package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.carver.CarverDebugSettings.class)
public class CarverDebugSettings_1050888711Mixin {
        @Inject(at = @At("HEAD"), method = "of(ZLnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/carver/CarverDebugSettings;", cancellable = true)
    private static void of_637081617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(637081617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/carver/CarverDebugSettings;", cancellable = true)
    private static void of_867699193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867699193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(ZLnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/carver/CarverDebugSettings;", cancellable = true)
    private static void of__364783484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364783484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAirState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getAirState_1632155921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632155921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDebugMode()Z", cancellable = true)
    private void isDebugMode_2105488049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105488049L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBarrierState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBarrierState_363297668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363297668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWaterState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getWaterState_1161823140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1161823140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLavaState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getLavaState_1907537551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1907537551L))
            info.setReturnValue(null);
    }


}
