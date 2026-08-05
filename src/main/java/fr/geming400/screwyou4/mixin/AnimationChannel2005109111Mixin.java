package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.AnimationChannel.class)
public class AnimationChannel2005109111Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__904345926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-904345926L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/client/animation/AnimationChannel$Target;", cancellable = true)
    private void target__1695758710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695758710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_869649136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869649136L))
            info.setReturnValue("m]%qo94dF7qL\u9C6E[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2043371853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043371853L))
            info.setReturnValue(666604519);
    }

    @Inject(at = @At("HEAD"), method = "keyframes()[Lnet/minecraft/client/animation/Keyframe;", cancellable = true)
    private void keyframes_1963519033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963519033L))
            info.setReturnValue(null);
    }


}
