package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhaseManager.class)
public class EnderDragonPhaseManager_2101646849Mixin {
        @Inject(at = @At("HEAD"), method = "getPhase(Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;)Lnet/minecraft/world/entity/boss/enderdragon/phases/DragonPhaseInstance;", cancellable = true)
    private void getPhase_1813823853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813823853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPhase(Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;)V", cancellable = true)
    private void setPhase_99260071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(99260071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/DragonPhaseInstance;", cancellable = true)
    private void getCurrentPhase__663236635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663236635L))
            info.setReturnValue(null);
    }


}
