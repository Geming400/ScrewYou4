package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.carver.CarverDebugSettings.class)
public class CarverDebugSettings_1050888711Mixin {
        @Inject(at = @At("HEAD"), method = "of(ZLnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/carver/CarverDebugSettings;", cancellable = true)
    private static void of__1842154310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842154310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/carver/CarverDebugSettings;", cancellable = true)
    private static void of_233534512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(233534512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(ZLnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/levelgen/carver/CarverDebugSettings;", cancellable = true)
    private static void of__1034278419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034278419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBarrierState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBarrierState__1244870156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244870156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAirState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getAirState__1244870156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244870156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWaterState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getWaterState__1244870156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244870156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLavaState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getLavaState__1244870156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244870156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDebugMode()Z", cancellable = true)
    private void isDebugMode_1089167293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089167293L))
            info.setReturnValue(null);
    }


}
