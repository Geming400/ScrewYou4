package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.random.Weighted.class)
public class Weighted1003718235Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value_197287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(197287L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_95091967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(95091967L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1774141760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1774141760L))
            info.setReturnValue(".\uB9DBH+dy!6tg\u82E7\u4448Jn@k\u5EC7v4)W@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1561070326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1561070326L))
            info.setReturnValue(1278127600);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/util/random/Weighted;", cancellable = true)
    private void map__2009098021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2009098021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weight()I", cancellable = true)
    private void weight__1266096951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266096951L))
            info.setReturnValue(-357582888);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1355367048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355367048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_416086900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416086900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec_533818324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(533818324L))
            info.setReturnValue(null);
    }


}
