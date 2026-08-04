package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonSittingFlamingPhase.class)
public class DragonSittingFlamingPhase22638006Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_60912745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(60912745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "end()V", cancellable = true)
    private void end_60912745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(60912745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__1345719522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1345719522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doClientTick()V", cancellable = true)
    private void doClientTick_60912745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(60912745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__955771334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-955771334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetFlameCount()V", cancellable = true)
    private void resetFlameCount_60912745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(60912745L))
            info.cancel();
    }


}
