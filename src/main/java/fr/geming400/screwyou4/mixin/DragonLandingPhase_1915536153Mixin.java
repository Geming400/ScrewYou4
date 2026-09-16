package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonLandingPhase.class)
public class DragonLandingPhase_1915536153Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin__1320267070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1320267070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase_367079003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367079003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation_82256686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(82256686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTurnSpeed()F", cancellable = true)
    private void getTurnSpeed__1143008473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143008473L))
            info.setReturnValue(8.594863E8F);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__380744943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-380744943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doClientTick()V", cancellable = true)
    private void doClientTick__1998858568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1998858568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlySpeed()F", cancellable = true)
    private void getFlySpeed_1881412337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881412337L))
            info.setReturnValue(8.594863E8F);
    }


}
