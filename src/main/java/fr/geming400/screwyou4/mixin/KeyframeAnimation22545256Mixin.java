package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.KeyframeAnimation.class)
public class KeyframeAnimation22545256Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/AnimationState;F)V", cancellable = true)
    private void apply_112097972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(112097972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/AnimationState;FF)V", cancellable = true)
    private void apply__1471658344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1471658344L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "apply(JF)V", cancellable = true)
    private void apply_1548947497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1548947497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyWalk(FFFF)V", cancellable = true)
    private void applyWalk__1983617244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1983617244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyStatic()V", cancellable = true)
    private void applyStatic_1911251999(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1911251999L))
            info.cancel();
    }


}
