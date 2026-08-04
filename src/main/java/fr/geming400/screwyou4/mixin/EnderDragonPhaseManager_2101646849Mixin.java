package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhaseManager.class)
public class EnderDragonPhaseManager_2101646849Mixin {
        @Inject(at = @At("HEAD"), method = "getPhase(Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;)Lnet/minecraft/world/entity/boss/enderdragon/phases/DragonPhaseInstance;", cancellable = true)
    private void getPhase_352796306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352796306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/DragonPhaseInstance;", cancellable = true)
    private void getCurrentPhase_762270189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762270189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPhase(Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;)V", cancellable = true)
    private void setPhase_576767918(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(576767918L))
            info.cancel();
    }


}
