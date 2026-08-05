package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonHoverPhase.class)
public class DragonHoverPhase403379874Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_441654613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(441654613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__964977654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964977654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__575029466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-575029466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation_1501109403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1501109403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlySpeed()F", cancellable = true)
    private void getFlySpeed_441639237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441639237L))
            info.setReturnValue(9.135941E8F);
    }

    @Inject(at = @At("HEAD"), method = "isSitting()Z", cancellable = true)
    private void isSitting_441658457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441658457L))
            info.setReturnValue(true);
    }


}
