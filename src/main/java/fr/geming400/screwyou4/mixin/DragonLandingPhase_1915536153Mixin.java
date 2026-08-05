package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonLandingPhase.class)
public class DragonLandingPhase_1915536153Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_1953810891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1953810891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase_547178624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547178624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTurnSpeed()F", cancellable = true)
    private void getTurnSpeed_1953795515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953795515L))
            info.setReturnValue(2.994429E8F);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick_937126812(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(937126812L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__1281701615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281701615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlySpeed()F", cancellable = true)
    private void getFlySpeed_1953795515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953795515L))
            info.setReturnValue(2.994429E8F);
    }

    @Inject(at = @At("HEAD"), method = "doClientTick()V", cancellable = true)
    private void doClientTick_1953810891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1953810891L))
            info.cancel();
    }


}
