package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.random.WeightedList.class)
public class WeightedList2113806233Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__795649300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795649300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2142898817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142898817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of([Lnet/minecraft/util/random/Weighted;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private static void of_795179783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795179783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private static void of_1607322615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607322615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/List;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private static void of__186381274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186381274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/Object;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private static void of__319828261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-319828261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of([Ljava/lang/Object;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private static void of__2083732176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083732176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__2142882480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142882480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void map_1111412471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111412471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/util/random/WeightedList$Builder;", cancellable = true)
    private static void builder__389335872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-389335872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/Object;)Z", cancellable = true)
    private void contains__795649300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795649300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Ljava/util/List;", cancellable = true)
    private void unwrap__554824247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554824247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private void getRandom__139890777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-139890777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1697483088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697483088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_616896904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616896904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomOrThrow(Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;", cancellable = true)
    private void getRandomOrThrow_1266490260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266490260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__156921572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156921572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyCodec(Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void nonEmptyCodec_616896904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616896904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void nonEmptyCodec__1697483088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697483088L))
            info.setReturnValue(null);
    }


}
