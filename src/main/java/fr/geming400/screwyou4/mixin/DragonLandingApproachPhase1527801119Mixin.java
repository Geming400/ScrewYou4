package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonLandingApproachPhase.class)
public class DragonLandingApproachPhase1527801119Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_1566075858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1566075858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase_159443591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159443591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick_549391779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(549391779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__1669436648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1669436648L))
            info.setReturnValue(null);
    }


}
