package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.AnimationDefinition.Builder.class)
public class Builder131674696Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/animation/AnimationDefinition;", cancellable = true)
    private void build__1192392376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192392376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAnimation(Ljava/lang/String;Lnet/minecraft/client/animation/AnimationChannel;)Lnet/minecraft/client/animation/AnimationDefinition$Builder;", cancellable = true)
    private void addAnimation_1443359597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1443359597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLength(F)Lnet/minecraft/client/animation/AnimationDefinition$Builder;", cancellable = true)
    private static void withLength__1515997927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1515997927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "looping()Lnet/minecraft/client/animation/AnimationDefinition$Builder;", cancellable = true)
    private void looping_361762913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(361762913L))
            info.setReturnValue(null);
    }


}
