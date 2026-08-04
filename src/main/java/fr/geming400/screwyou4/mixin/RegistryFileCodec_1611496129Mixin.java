package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryFileCodec.class)
public class RegistryFileCodec_1611496129Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_476035657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476035657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode_1293017985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1293017985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Lnet/minecraft/core/Holder;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode__898031022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-898031022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_719254565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719254565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;)Lnet/minecraft/resources/RegistryFileCodec;", cancellable = true)
    private static void create_750208488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750208488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;Z)Lnet/minecraft/resources/RegistryFileCodec;", cancellable = true)
    private static void create__417484100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417484100L))
            info.setReturnValue(null);
    }


}
