package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.random.WeightedList.class)
public class WeightedList2113806233Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1205179469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205179469L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1623809468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623809468L))
            info.setReturnValue(1347724783);
    }

    @Inject(at = @At("HEAD"), method = "of([Lnet/minecraft/util/random/Weighted;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private static void of_1758014992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758014992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private static void of_1722921806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1722921806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/List;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private static void of__2032900739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032900739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Object;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private static void of__1003540878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003540878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of([Ljava/lang/Object;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private static void of__1803986823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803986823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1122044691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122044691L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void map__1937223397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937223397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/util/random/WeightedList$Builder;", cancellable = true)
    private static void builder__112255781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-112255781L))
            info.setReturnValue(new net.minecraft.util.random.WeightedList.Builder());
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/Object;)Z", cancellable = true)
    private void contains__1949208083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949208083L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Ljava/util/List;", cancellable = true)
    private void unwrap_778627244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778627244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private void getRandom__2001273330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001273330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1829512250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829512250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1526174898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1526174898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_1643906322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643906322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void nonEmptyCodec_1601186086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601186086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyCodec(Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void nonEmptyCodec__1876440238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1876440238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomOrThrow(Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;", cancellable = true)
    private void getRandomOrThrow__2109734006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109734006L))
            info.setReturnValue(new java.lang.Object());
    }


}
