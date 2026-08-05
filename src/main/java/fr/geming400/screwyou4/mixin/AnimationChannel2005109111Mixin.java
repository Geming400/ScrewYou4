package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.AnimationChannel.class)
public class AnimationChannel2005109111Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1096482843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096482843L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/client/animation/AnimationChannel$Target;", cancellable = true)
    private void target_1843634331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843634331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1519434660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519434660L))
            info.setReturnValue("_6a@B3gPoZcC\uAD40lU:rC^_:\"_`oP/6j}R\u0459,Dr[Xbfn|))");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1732506094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732506094L))
            info.setReturnValue(-1779729639);
    }

    @Inject(at = @At("HEAD"), method = "keyframes()[Lnet/minecraft/client/animation/Keyframe;", cancellable = true)
    private void keyframes_315603774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315603774L))
            info.setReturnValue(null);
    }


}
