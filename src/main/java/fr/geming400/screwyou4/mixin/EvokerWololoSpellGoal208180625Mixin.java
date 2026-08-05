package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.Evoker.EvokerWololoSpellGoal.class)
public class EvokerWololoSpellGoal208180625Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1417855774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1417855774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1785283970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1785283970L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__706259439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706259439L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_78625927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78625927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__481454669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481454669L))
            info.setReturnValue(true);
    }


}
