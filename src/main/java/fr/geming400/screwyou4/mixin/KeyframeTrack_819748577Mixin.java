package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.KeyframeTrack.class)
public class KeyframeTrack_819748577Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2089706461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089706461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__315711399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315711399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_858011318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858011318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void mapCodec_1215375867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1215375867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyframes()Ljava/util/List;", cancellable = true)
    private void keyframes__1848881904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848881904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "easingType()Lnet/minecraft/util/EasingType;", cancellable = true)
    private void easingType__2054099322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054099322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validatePeriod(Lnet/minecraft/util/KeyframeTrack;I)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void validatePeriod__595588331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595588331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bakeSampler(Ljava/util/Optional;Lnet/minecraft/world/attribute/LerpFunction;)Lnet/minecraft/util/KeyframeTrackSampler;", cancellable = true)
    private void bakeSampler_1947749867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947749867L))
            info.setReturnValue(null);
    }


}
