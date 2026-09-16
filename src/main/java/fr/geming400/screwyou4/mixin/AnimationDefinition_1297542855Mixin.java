package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.AnimationDefinition.class)
public class AnimationDefinition_1297542855Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_388916586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388916586L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2067966379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067966379L))
            info.setReturnValue("8H\u3592S.:{[JH\uCF55\u48E0M0AEJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1854894945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854894945L))
            info.setReturnValue(290358803);
    }

    @Inject(at = @At("HEAD"), method = "lengthInSeconds()F", cancellable = true)
    private void lengthInSeconds__1027607403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1027607403L))
            info.setReturnValue(3.040309E8F);
    }

    @Inject(at = @At("HEAD"), method = "boneAnimations()Ljava/util/Map;", cancellable = true)
    private void boneAnimations_321333115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321333115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/model/geom/ModelPart;)Lnet/minecraft/client/animation/KeyframeAnimation;", cancellable = true)
    private void bake_340984584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340984584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "looping()Z", cancellable = true)
    private void looping__309400449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309400449L))
            info.setReturnValue(false);
    }


}
