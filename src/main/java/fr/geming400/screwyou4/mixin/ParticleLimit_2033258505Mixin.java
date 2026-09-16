package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.ParticleLimit.class)
public class ParticleLimit_2033258505Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1124632236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1124632236L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1491285267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1491285267L))
            info.setReturnValue("{%4\u1FA12[Uz>wpl%v5KbUK\u825C\u8F6Afy;0]4|gK\u70EC%# Xx/MxqeZ|?I\u9FCB^3-\u84A9y.tV\uBF95 U \uD306hy?OZ\u7A41g\u2F05Ml6Mi");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1704356701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1704356701L))
            info.setReturnValue(743853354);
    }

    @Inject(at = @At("HEAD"), method = "limit()I", cancellable = true)
    private void limit_231126803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231126803L))
            info.setReturnValue(1710494639);
    }


}
