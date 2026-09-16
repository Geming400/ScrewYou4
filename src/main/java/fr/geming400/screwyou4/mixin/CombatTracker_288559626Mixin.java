package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.CombatTracker.class)
public class CombatTracker_288559626Mixin {
        @Inject(at = @At("HEAD"), method = "recordDamage(Lnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void recordDamage_1011872985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1011872985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDeathMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDeathMessage__404362043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404362043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recheckStatus()V", cancellable = true)
    private void recheckStatus__448231915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-448231915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCombatDuration()I", cancellable = true)
    private void getCombatDuration_2032988433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032988433L))
            info.setReturnValue(-407982061);
    }


}
