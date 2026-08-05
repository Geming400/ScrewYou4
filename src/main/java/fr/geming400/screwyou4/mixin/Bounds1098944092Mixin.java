package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MinMaxBounds.Bounds.class)
public class Bounds1098944092Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1810510945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1810510945L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__36515883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-36515883L))
            info.setReturnValue("s)5XI`畈q}bpgB,D:av>hy#ᬎh_<u鶲RKOdᮑ檫y5ꐭEkYVj_w!^H嶺K^#*벿EQvMtWed櫡?**N{Nϧ8v");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1137206834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137206834L))
            info.setReturnValue(417944012);
    }

    @Inject(at = @At("HEAD"), method = "min()Ljava/util/Optional;", cancellable = true)
    private void min_1344405514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344405514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()Ljava/util/Optional;", cancellable = true)
    private void max_1344405514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344405514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void map__1172597439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172597439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "between(Ljava/lang/Number;Ljava/lang/Number;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void between__1672343723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672343723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "any()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void any__236860111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236860111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void createCodec_1582622067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582622067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createStreamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void createStreamCodec__1171783713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171783713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateSwappedBoundsInCodec()Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void validateSwappedBoundsInCodec__645561781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645561781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atMost(Ljava/lang/Number;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void atMost__342202749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342202749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atLeast(Ljava/lang/Number;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void atLeast__342202749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342202749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAny()Z", cancellable = true)
    private void isAny_1137222675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137222675L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "asRange()Lcom/google/common/collect/Range;", cancellable = true)
    private void asRange__2024590812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024590812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "areSwapped()Z", cancellable = true)
    private void areSwapped_1137222675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137222675L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fromReader(Lcom/mojang/brigadier/StringReader;Ljava/util/function/Function;Ljava/util/function/Supplier;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void fromReader_356060615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356060615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exactly(Ljava/lang/Number;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void exactly__342202749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342202749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asPoint()Ljava/util/Optional;", cancellable = true)
    private void asPoint_1344405514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344405514L))
            info.setReturnValue(null);
    }


}
