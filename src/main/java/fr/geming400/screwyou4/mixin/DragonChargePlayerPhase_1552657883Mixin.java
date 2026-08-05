package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonChargePlayerPhase.class)
public class DragonChargePlayerPhase_1552657883Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin__1683145340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1683145340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setTarget_1608261036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1608261036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase_4200733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(4200733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__280621584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280621584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__743623213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-743623213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlySpeed()F", cancellable = true)
    private void getFlySpeed_1518534067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518534067L))
            info.setReturnValue(2.23686E8F);
    }


}
