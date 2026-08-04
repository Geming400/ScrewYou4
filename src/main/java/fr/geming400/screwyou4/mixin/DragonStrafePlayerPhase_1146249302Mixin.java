package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonStrafePlayerPhase.class)
public class DragonStrafePlayerPhase_1146249302Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_1184524040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1184524040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_1467912632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1467912632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__222108227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222108227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__2050988466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2050988466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick_167839961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(167839961L))
            info.cancel();
    }


}
