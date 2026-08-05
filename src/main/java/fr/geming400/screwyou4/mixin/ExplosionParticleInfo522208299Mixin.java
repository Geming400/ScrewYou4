package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.ExplosionParticleInfo.class)
public class ExplosionParticleInfo522208299Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1907720558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1907720558L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__613251676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613251676L))
            info.setReturnValue("GwAࢎ]70S7ඉr|X%#=N&),20=cSVt(빯UG+懙쫎@p+掍e惍{R4#겏cU슠m|u+e옾iG쉋Q暖T沋g莻");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_560471041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560471041L))
            info.setReturnValue(1381486535);
    }

    @Inject(at = @At("HEAD"), method = "scaling()F", cancellable = true)
    private void scaling_560467662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560467662L))
            info.setReturnValue(6.771199E8F);
    }

    @Inject(at = @At("HEAD"), method = "speed()F", cancellable = true)
    private void speed_560467662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560467662L))
            info.setReturnValue(6.771199E8F);
    }

    @Inject(at = @At("HEAD"), method = "particle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void particle__1546752769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546752769L))
            info.setReturnValue(null);
    }


}
