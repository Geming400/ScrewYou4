package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MinMaxBounds.Bounds.class)
public class Bounds1098944092Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_190317824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190317824L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1869367617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869367617L))
            info.setReturnValue("c90\u20856gR <v7g:vU\uB472%t&y7'sqd:[\u221Et9Lr\u2F45lX\u8594m}}xw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1656296183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1656296183L))
            info.setReturnValue(496035303);
    }

    @Inject(at = @At("HEAD"), method = "min()Ljava/util/Optional;", cancellable = true)
    private void min_1183469660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183469660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()Ljava/util/Optional;", cancellable = true)
    private void max_1638054254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1638054254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void map_315685021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315685021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "between(Ljava/lang/Number;Ljava/lang/Number;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void between_1997153869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997153869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "any()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void any_1376044485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376044485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void createCodec__1843591955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843591955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atMost(Ljava/lang/Number;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void atMost_1220010733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220010733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atLeast(Ljava/lang/Number;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void atLeast_776111949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776111949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createStreamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void createStreamCodec_167068217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167068217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateSwappedBoundsInCodec()Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void validateSwappedBoundsInCodec_649871509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649871509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asPoint()Ljava/util/Optional;", cancellable = true)
    private void asPoint_285544072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285544072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exactly(Ljava/lang/Number;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void exactly_1697964855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697964855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAny()Z", cancellable = true)
    private void isAny__96852751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96852751L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "asRange()Lcom/google/common/collect/Range;", cancellable = true)
    private void asRange__1170213671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170213671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "areSwapped()Z", cancellable = true)
    private void areSwapped_487261035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487261035L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fromReader(Lcom/mojang/brigadier/StringReader;Ljava/util/function/Function;Ljava/util/function/Supplier;)Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private static void fromReader__1073689260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073689260L))
            info.setReturnValue(null);
    }


}
