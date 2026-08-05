package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonLandingApproachPhase.class)
public class DragonLandingApproachPhase1527801119Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin__1708002103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1708002103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__20656030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-20656030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__305478347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-305478347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__768479976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-768479976L))
            info.cancel();
    }


}
