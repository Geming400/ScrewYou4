package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.AmbientParticle.class)
public class AmbientParticle844810720Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__63815548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-63815548L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1615234245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615234245L))
            info.setReturnValue("- \uFA8D\uD3AE\u8806gHE?BBSg V\u3428\u85D7oJz\u7D71U{\u48AEc_\u96CEGoLF]>\u3D9F[H'-R%?h#,:.\u1B4C5-\u1812\"}!9F8,YpQ5\u9991lX9lu0\u1701V=\uF94Fid");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1402162811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402162811L))
            info.setReturnValue(-1843776250);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/particles/ParticleOptions;F)Ljava/util/List;", cancellable = true)
    private static void of__655999184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-655999184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void particle_813659066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813659066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpawn(Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void canSpawn__1797635454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797635454L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "probability()F", cancellable = true)
    private void probability_813618542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813618542L))
            info.setReturnValue(6.16316E8F);
    }


}
