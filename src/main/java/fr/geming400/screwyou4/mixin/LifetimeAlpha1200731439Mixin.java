package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.Particle.LifetimeAlpha.class)
public class LifetimeAlpha1200731439Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_292105171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(292105171L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1971154964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971154964L))
            info.setReturnValue("zpw\u72E5?!f\u6B55]ZT?.40_\uAB79}VTQnt/+Dp|\u5BAE+/1i;PoV6`GatV^iNc{\u13B8U3Ol\u9B1Dh#\u1BD5N$w\uA739h3LpebvP9X:\uBF7Dr*}\u63772b9W\u35B6epT\u3C1B)Z|w\u15ED0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1758083530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758083530L))
            info.setReturnValue(1112081665);
    }

    @Inject(at = @At("HEAD"), method = "isOpaque()Z", cancellable = true)
    private void isOpaque_1191104475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1191104475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startAlpha()F", cancellable = true)
    private void startAlpha_1835140918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1835140918L))
            info.setReturnValue(5.059076E8F);
    }

    @Inject(at = @At("HEAD"), method = "endAlpha()F", cancellable = true)
    private void endAlpha_72108143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(72108143L))
            info.setReturnValue(5.059076E8F);
    }

    @Inject(at = @At("HEAD"), method = "currentAlphaForAge(IIF)F", cancellable = true)
    private void currentAlphaForAge_1062365923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062365923L))
            info.setReturnValue(5.059076E8F);
    }

    @Inject(at = @At("HEAD"), method = "endAtNormalizedAge()F", cancellable = true)
    private void endAtNormalizedAge__814821032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-814821032L))
            info.setReturnValue(5.059076E8F);
    }

    @Inject(at = @At("HEAD"), method = "startAtNormalizedAge()F", cancellable = true)
    private void startAtNormalizedAge_481690463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481690463L))
            info.setReturnValue(5.059076E8F);
    }


}
