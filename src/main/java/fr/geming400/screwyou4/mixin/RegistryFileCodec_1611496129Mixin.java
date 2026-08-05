package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryFileCodec.class)
public class RegistryFileCodec_1611496129Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1913048139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1913048139L))
            info.setReturnValue("mvq1-\uBCBA\u9B4E\uB66Bb5$h{Emaq` H@M|iE^\u95DDDr0*y\u18BEGY\u7E08\u170F\u94BAC_c\uBC06cpR\u8EDA-UtI\u50AC5f(`H_\u89FA-i\u61D4<m\u9439'q+\uA7D9@\u3593S\u0D6D>e\u0898SwS\uCFAF@'\uA23Et1qn\u6654\u62F9w=}p");
    }

    @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode_104516975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104516975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Lnet/minecraft/core/Holder;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_21057148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21057148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_955158715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955158715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;)Lnet/minecraft/resources/RegistryFileCodec;", cancellable = true)
    private static void create_285065444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285065444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;Z)Lnet/minecraft/resources/RegistryFileCodec;", cancellable = true)
    private static void create__1952016576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952016576L))
            info.setReturnValue(null);
    }


}
