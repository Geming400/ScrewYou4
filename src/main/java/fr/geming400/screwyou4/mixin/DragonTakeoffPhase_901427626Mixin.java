package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonTakeoffPhase.class)
public class DragonTakeoffPhase_901427626Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_1960591699(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1960591699L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__647029524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-647029524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__1394853470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1394853470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__931851841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-931851841L))
            info.setReturnValue(null);
    }


}
