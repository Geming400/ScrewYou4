package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonHoldingPatternPhase.class)
public class DragonHoldingPatternPhase_1129469171Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin__2106334052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2106334052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__418987979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418987979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__1166811925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1166811925L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__703810296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703810296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCrystalDestroyed(Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/damagesource/DamageSource;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void onCrystalDestroyed__371435332(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-371435332L))
            info.cancel();
    }


}
