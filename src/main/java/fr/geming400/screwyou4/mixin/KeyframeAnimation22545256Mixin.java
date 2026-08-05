package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.KeyframeAnimation.class)
public class KeyframeAnimation22545256Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/AnimationState;F)V", cancellable = true)
    private void apply__1846395806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1846395806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/AnimationState;FF)V", cancellable = true)
    private void apply__2055423318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2055423318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "apply(JF)V", cancellable = true)
    private void apply__947475625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947475625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyWalk(FFFF)V", cancellable = true)
    private void applyWalk__2047748197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2047748197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyStatic()V", cancellable = true)
    private void applyStatic_60819995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(60819995L))
            info.cancel();
    }


}
