package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.phases.DragonSittingAttackingPhase.class)
public class DragonSittingAttackingPhase1102101132Mixin {
        @Inject(at = @At("HEAD"), method = "begin()V", cancellable = true)
    private void begin__2133702090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2133702090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase()Lnet/minecraft/world/entity/boss/enderdragon/phases/EnderDragonPhase;", cancellable = true)
    private void getPhase__446356017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446356017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doClientTick()V", cancellable = true)
    private void doClientTick_1482673708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1482673708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doServerTick(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void doServerTick__1194179963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1194179963L))
            info.cancel();
    }


}
