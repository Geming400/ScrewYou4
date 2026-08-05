package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.AnimationDefinition.Builder.class)
public class Builder131674696Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/animation/AnimationDefinition;", cancellable = true)
    private void build__1681922854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1681922854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addAnimation(Ljava/lang/String;Lnet/minecraft/client/animation/AnimationChannel;)Lnet/minecraft/client/animation/AnimationDefinition$Builder;", cancellable = true)
    private void addAnimation__413019600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413019600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLength(F)Lnet/minecraft/client/animation/AnimationDefinition$Builder;", cancellable = true)
    private static void withLength_1842517733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1842517733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "looping()Lnet/minecraft/client/animation/AnimationDefinition$Builder;", cancellable = true)
    private void looping_2022269347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022269347L))
            info.setReturnValue(null);
    }


}
