package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonTakeoffPhase.class)
public class DragonTakeoffPhase_901427626Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_939702364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(939702364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__466929903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466929903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation_1999157154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999157154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__76981715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-76981715L))
            info.cancel();
    }


}
