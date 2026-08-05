package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ExtraCodecs.StrictUnboundedMapCodec.class)
public class StrictUnboundedMapCodec807730888Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2101724149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101724149L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__327729583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327729583L))
            info.setReturnValue("vn\u3FC1]7\u81CAze\u7BE2g)Q\u66AEO5>DL\u16D5\uC257.\u9D9AI+3tgIPC!iH,U{ =6lx}dX<{<G\u138A!t>!\u4AD63\u4558]U<\uD55F#5swAHMzO`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_845993630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845993630L))
            info.setReturnValue(-1584844573);
    }

    @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode_1758522583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758522583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode_489252745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489252745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode__84510675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84510675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/util/Map;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode__2056898194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056898194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void keyCodec_415765262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415765262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elementCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void elementCodec_415765262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415765262L))
            info.setReturnValue(null);
    }


}
