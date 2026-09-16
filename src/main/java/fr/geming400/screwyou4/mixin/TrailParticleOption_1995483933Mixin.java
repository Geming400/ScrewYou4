package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.TrailParticleOption.class)
public class TrailParticleOption_1995483933Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1086857664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086857664L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void target__1949200924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949200924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1529059839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1529059839L))
            info.setReturnValue("1\"PK0M\u07E7\u236E\u7ED86_taY\u94B0\uC342rx\u7323H\uCC857\"^}Av-&sJBP1,=\uCA82wE*.2NS\u3DD6\u1D8E!}|\uBF26[/YAq<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1742131273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742131273L))
            info.setReturnValue(-1524861628);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_2083098606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2083098606L))
            info.setReturnValue(2030241881);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType__2102368686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2102368686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color__1062832257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062832257L))
            info.setReturnValue(938392425);
    }


}
