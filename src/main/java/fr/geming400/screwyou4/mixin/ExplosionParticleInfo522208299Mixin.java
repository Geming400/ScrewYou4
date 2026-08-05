package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.ExplosionParticleInfo.class)
public class ExplosionParticleInfo522208299Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__386417969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386417969L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1292631824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292631824L))
            info.setReturnValue("X\u943Dcw\uC5D36eXts\u52EACi|FC>C_lO&U\u6A10)>>lJ*J@\u1ED7t6=1e04\u70C7z6t5[HHP6`\uFB3C<O{]m8:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1079560390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079560390L))
            info.setReturnValue(-1480554895);
    }

    @Inject(at = @At("HEAD"), method = "particle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void particle_491056645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491056645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speed()F", cancellable = true)
    private void speed_1101472487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101472487L))
            info.setReturnValue(5.51273E8F);
    }

    @Inject(at = @At("HEAD"), method = "scaling()F", cancellable = true)
    private void scaling_1298476967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298476967L))
            info.setReturnValue(5.51273E8F);
    }


}
