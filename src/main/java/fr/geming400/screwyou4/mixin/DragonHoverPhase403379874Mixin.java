package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonHoverPhase.class)
public class DragonHoverPhase403379874Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_1462543948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1462543948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__1145077275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145077275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSitting()Z", cancellable = true)
    private void isSitting_1508003159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508003159L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__1892901221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1892901221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlySpeed()F", cancellable = true)
    private void getFlySpeed_369256059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369256059L))
            info.setReturnValue(4.26161E8F);
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__1429899592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429899592L))
            info.setReturnValue(null);
    }


}
