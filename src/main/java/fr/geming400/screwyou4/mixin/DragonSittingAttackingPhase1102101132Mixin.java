package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonSittingAttackingPhase.class)
public class DragonSittingAttackingPhase1102101132Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin_1140375871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1140375871L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__266256396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-266256396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick_123691792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(123691792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doClientTick()V", cancellable = true)
    private void doClientTick_1140375871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1140375871L))
            info.cancel();
    }


}
