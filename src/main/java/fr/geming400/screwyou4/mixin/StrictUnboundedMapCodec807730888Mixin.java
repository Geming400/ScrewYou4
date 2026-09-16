package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ExtraCodecs.StrictUnboundedMapCodec.class)
public class StrictUnboundedMapCodec807730888Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__100895380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-100895380L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1578153917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578153917L))
            info.setReturnValue("7TIY.\u2AA1QHa(>kuDicB)MS6bGN+4V{;I,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1365082979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365082979L))
            info.setReturnValue(1751783966);
    }

    @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode_1794390725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1794390725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode__699248265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-699248265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_151393475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151393475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/util/Map;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_1128256664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128256664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void keyCodec__1694185339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694185339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elementCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void elementCodec_1390730376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390730376L))
            info.setReturnValue(null);
    }


}
