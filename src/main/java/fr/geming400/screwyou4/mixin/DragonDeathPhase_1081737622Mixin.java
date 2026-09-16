package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonDeathPhase.class)
public class DragonDeathPhase_1081737622Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_2140901695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2140901695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__466719528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466719528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doClientTick()V", cancellable = true)
    private void doClientTick_1462310197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1462310197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFlySpeed()F", cancellable = true)
    private void getFlySpeed_1047613806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047613806L))
            info.setReturnValue(9.099347E8F);
    }

    @Inject(at = @At("HEAD"), method = "getFlyTargetLocation()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlyTargetLocation__751541845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-751541845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__1214543474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1214543474L))
            info.cancel();
    }


}
