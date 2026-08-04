package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.AnimationDefinition.class)
public class AnimationDefinition_1297542855Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1611912183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611912183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_162082879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162082879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1335805596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335805596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "boneAnimations()Ljava/util/Map;", cancellable = true)
    private void boneAnimations__707080786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707080786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lengthInSeconds()F", cancellable = true)
    private void lengthInSeconds_1335802217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335802217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "looping()Z", cancellable = true)
    private void looping_1335821437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335821437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/model/geom/ModelPart;)Lnet/minecraft/client/animation/KeyframeAnimation;", cancellable = true)
    private void bake__1557339711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557339711L))
            info.setReturnValue(null);
    }


}
