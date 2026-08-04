package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonChargePlayerPhase.class)
public class DragonChargePlayerPhase_1552657883Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_1590932621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1590932621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setTarget_1920393881(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1920393881L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase_184300354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184300354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__1644579885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644579885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick_574248542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(574248542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlySpeed()F", cancellable = true)
    private void getFlySpeed_1590917245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590917245L))
            info.setReturnValue(null);
    }


}
