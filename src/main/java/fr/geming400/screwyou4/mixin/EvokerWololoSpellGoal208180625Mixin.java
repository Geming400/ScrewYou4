package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.Evoker.EvokerWololoSpellGoal.class)
public class EvokerWololoSpellGoal208180625Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_246584324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(246584324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_246455364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(246455364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_246459208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(246459208L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_246584324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(246584324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_246459208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(246459208L))
            info.setReturnValue(true);
    }


}
