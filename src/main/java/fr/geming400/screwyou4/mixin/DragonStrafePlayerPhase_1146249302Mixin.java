package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonStrafePlayerPhase.class)
public class DragonStrafePlayerPhase_1146249302Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin__2089553921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2089553921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_1288655115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1288655115L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__402207848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-402207848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__1150031794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1150031794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__687030165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-687030165L))
            info.setReturnValue(null);
    }


}
