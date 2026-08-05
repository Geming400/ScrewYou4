package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.AmbientParticle.class)
public class AmbientParticle844810720Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2064644317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2064644317L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__290649255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-290649255L))
            info.setReturnValue("怐⦓WJ\"ArbHtw≟a@V`f$X\"Sn0 .ꔐD/lK$!h1PPw?*F/]1Q%{X@?燧^a:r䨻?1q塏fP|_lVu]J-0J/:_f/x1&N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_883073462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883073462L))
            info.setReturnValue(-1609931973);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/particles/ParticleOptions;F)Ljava/util/List;", cancellable = true)
    private static void of__491358105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491358105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void particle__1224150348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1224150348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpawn(Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void canSpawn__862200521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-862200521L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "probability()F", cancellable = true)
    private void probability_883070083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883070083L))
            info.setReturnValue(5.46661E7F);
    }


}
