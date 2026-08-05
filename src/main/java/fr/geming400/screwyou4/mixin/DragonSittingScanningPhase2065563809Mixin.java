package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonSittingScanningPhase.class)
public class DragonSittingScanningPhase2065563809Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin__1170239413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1170239413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase_517106660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517106660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__230717286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-230717286L))
            info.cancel();
    }


}
