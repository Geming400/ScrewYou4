package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.InclusiveRange.class)
public class InclusiveRange_1653793785Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_745167516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(745167516L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1870750483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1870750483L))
            info.setReturnValue("8<csU0K\u29DDC(E]D76v100ghBw?3q\u2EBC\u0A8A6w<N{BE;c[\u4569\u38EE\u59225\uB750HYUHL6Sgt\u83A9W36D;7 9=BJ/\u7372`r\u28C8T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2083821421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083821421L))
            info.setReturnValue(-387722292);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void map__274369578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-274369578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/util/InclusiveRange;)Z", cancellable = true)
    private void contains_1273725851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1273725851L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void create_1193103205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193103205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_2005442597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2005442597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__2147026333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2147026333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()Ljava/lang/Comparable;", cancellable = true)
    private void minInclusive_2109271250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109271250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()Ljava/lang/Comparable;", cancellable = true)
    private void maxInclusive_1794278528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1794278528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValueInRange(Ljava/lang/Comparable;)Z", cancellable = true)
    private void isValueInRange_1177802047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177802047L))
            info.setReturnValue(true);
    }


}
