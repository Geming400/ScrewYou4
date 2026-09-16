package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonSittingFlamingPhase.class)
public class DragonSittingFlamingPhase22638006Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_1081802080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1081802080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "end()V", cancellable = true)
    private void end_1695169646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1695169646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__1525819143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525819143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetFlameCount()V", cancellable = true)
    private void resetFlameCount_408063742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(408063742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doClientTick()V", cancellable = true)
    private void doClientTick_403210582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(403210582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick_2021324207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2021324207L))
            info.cancel();
    }


}
