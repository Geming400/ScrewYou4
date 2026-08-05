package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonDeathPhase.class)
public class DragonDeathPhase_1081737622Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_1120012360(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1120012360L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__286619907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-286619907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick_103328281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(103328281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doClientTick()V", cancellable = true)
    private void doClientTick_1120012360(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1120012360L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__2115500146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2115500146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlySpeed()F", cancellable = true)
    private void getFlySpeed_1119996984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119996984L))
            info.setReturnValue(8.646122E8F);
    }


}
