package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.CombatTracker.class)
public class CombatTracker_288559626Mixin {
        @Inject(at = @At("HEAD"), method = "recordDamage(Lnet/minecraft/world/damagesource/DamageSource;F)V", cancellable = true)
    private void recordDamage__1378753543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1378753543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recheckStatus()V", cancellable = true)
    private void recheckStatus_326834364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(326834364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDeathMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDeathMessage__1888349540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1888349540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCombatDuration()I", cancellable = true)
    private void getCombatDuration_326821871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(326821871L))
            info.setReturnValue(-548189655);
    }


}
