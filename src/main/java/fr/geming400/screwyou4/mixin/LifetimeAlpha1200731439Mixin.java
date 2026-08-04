package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.Particle.LifetimeAlpha.class)
public class LifetimeAlpha1200731439Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1708723598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708723598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_65271464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(65271464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1238994181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1238994181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpaque()Z", cancellable = true)
    private void isOpaque_1239010022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239010022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "currentAlphaForAge(IIF)F", cancellable = true)
    private void currentAlphaForAge_417853096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417853096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endAtNormalizedAge()F", cancellable = true)
    private void endAtNormalizedAge_1238990802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1238990802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startAtNormalizedAge()F", cancellable = true)
    private void startAtNormalizedAge_1238990802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1238990802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endAlpha()F", cancellable = true)
    private void endAlpha_1238990802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1238990802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startAlpha()F", cancellable = true)
    private void startAlpha_1238990802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1238990802L))
            info.setReturnValue(null);
    }


}
