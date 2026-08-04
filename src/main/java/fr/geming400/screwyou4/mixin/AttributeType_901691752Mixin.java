package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.AttributeType.class)
public class AttributeType_901691752Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2007763286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007763286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__233768720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233768720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_939954493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939954493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_509726125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509726125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toFloat()Lnet/minecraft/util/ToFloatFunction;", cancellable = true)
    private void toFloat__575667819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575667819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toFloat(Ljava/lang/Object;)F", cancellable = true)
    private void toFloat__2007783002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007783002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofNotInterpolated(Lcom/mojang/serialization/Codec;)Lnet/minecraft/world/attribute/AttributeType;", cancellable = true)
    private static void ofNotInterpolated_1977791288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977791288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofNotInterpolated(Lcom/mojang/serialization/Codec;Ljava/util/Map;)Lnet/minecraft/world/attribute/AttributeType;", cancellable = true)
    private static void ofNotInterpolated__846017659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-846017659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkAllowedModifier(Lnet/minecraft/world/attribute/modifier/AttributeModifier;)V", cancellable = true)
    private void checkAllowedModifier_2104548522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2104548522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "partialTickLerp()Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void partialTickLerp__1007022878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007022878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifierLibrary()Ljava/util/Map;", cancellable = true)
    private void modifierLibrary__1102931889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1102931889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofInterpolated(Lcom/mojang/serialization/Codec;Ljava/util/Map;Lnet/minecraft/world/attribute/LerpFunction;Lnet/minecraft/world/attribute/LerpFunction;Lnet/minecraft/util/ToFloatFunction;)Lnet/minecraft/world/attribute/AttributeType;", cancellable = true)
    private static void ofInterpolated_1706559020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706559020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofInterpolated(Lcom/mojang/serialization/Codec;Ljava/util/Map;Lnet/minecraft/world/attribute/LerpFunction;)Lnet/minecraft/world/attribute/AttributeType;", cancellable = true)
    private static void ofInterpolated__927323071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-927323071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifierCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void modifierCodec_509726125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509726125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyframeLerp()Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void keyframeLerp__1007022878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007022878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spatialLerp()Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void spatialLerp__1007022878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007022878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stateChangeLerp()Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void stateChangeLerp__1007022878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007022878L))
            info.setReturnValue(null);
    }


}
