package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.CombatEntry.class)
public class CombatEntry_874871232Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__33755037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33755037L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1645294756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1645294756L))
            info.setReturnValue("tw(#r,H4x05Al0URJ}IgMiu9^C}\"T(wcG%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1432223322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432223322L))
            info.setReturnValue(-28230108);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void source_842620106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842620106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallDistance()F", cancellable = true)
    private void fallDistance_222462418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222462418L))
            info.setReturnValue(7.569826E8F);
    }

    @Inject(at = @At("HEAD"), method = "damage()F", cancellable = true)
    private void damage_1644660307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1644660307L))
            info.setReturnValue(7.569826E8F);
    }

    @Inject(at = @At("HEAD"), method = "fallLocation()Lnet/minecraft/world/damagesource/FallLocation;", cancellable = true)
    private void fallLocation__1394616113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1394616113L))
            info.setReturnValue(null);
    }


}
