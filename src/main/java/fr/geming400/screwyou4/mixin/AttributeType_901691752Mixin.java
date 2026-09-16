package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.AttributeType.class)
public class AttributeType_901691752Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__6934517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6934517L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1672114780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672114780L))
            info.setReturnValue("R!Xj1)D/Q[gA'g_\u22119MKA,@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1459043842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459043842L))
            info.setReturnValue(-259574878);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_935242834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(935242834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toFloat()Lnet/minecraft/util/ToFloatFunction;", cancellable = true)
    private void toFloat__186841802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186841802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toFloat(Ljava/lang/Object;)F", cancellable = true)
    private void toFloat__607286299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-607286299L))
            info.setReturnValue(4.758208E8F);
    }

    @Inject(at = @At("HEAD"), method = "modifierCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void modifierCodec_1430357420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430357420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stateChangeLerp()Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void stateChangeLerp__1796510310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796510310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyframeLerp()Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void keyframeLerp_692546535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692546535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofNotInterpolated(Lcom/mojang/serialization/Codec;)Lnet/minecraft/world/attribute/AttributeType;", cancellable = true)
    private static void ofNotInterpolated__1869223431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1869223431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofNotInterpolated(Lcom/mojang/serialization/Codec;Ljava/util/Map;)Lnet/minecraft/world/attribute/AttributeType;", cancellable = true)
    private static void ofNotInterpolated_1782913700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782913700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifierLibrary()Ljava/util/Map;", cancellable = true)
    private void modifierLibrary_840154091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840154091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spatialLerp()Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void spatialLerp__808920195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808920195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "partialTickLerp()Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void partialTickLerp__2132501449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132501449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofInterpolated(Lcom/mojang/serialization/Codec;Ljava/util/Map;Lnet/minecraft/world/attribute/LerpFunction;)Lnet/minecraft/world/attribute/AttributeType;", cancellable = true)
    private static void ofInterpolated_953451579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953451579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofInterpolated(Lcom/mojang/serialization/Codec;Ljava/util/Map;Lnet/minecraft/world/attribute/LerpFunction;Lnet/minecraft/world/attribute/LerpFunction;Lnet/minecraft/util/ToFloatFunction;)Lnet/minecraft/world/attribute/AttributeType;", cancellable = true)
    private static void ofInterpolated_76175910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76175910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkAllowedModifier(Lnet/minecraft/world/attribute/modifier/AttributeModifier;)V", cancellable = true)
    private void checkAllowedModifier__899807405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-899807405L))
            info.cancel();
    }


}
