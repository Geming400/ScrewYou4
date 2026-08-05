package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonHoldingPatternPhase.class)
public class DragonHoldingPatternPhase_1129469171Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_1167743909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1167743909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__238888358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-238888358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick_151059830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(151059830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__2067768597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067768597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCrystalDestroyed(Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/damagesource/DamageSource;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void onCrystalDestroyed__1761224834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1761224834L))
            info.cancel();
    }


}
