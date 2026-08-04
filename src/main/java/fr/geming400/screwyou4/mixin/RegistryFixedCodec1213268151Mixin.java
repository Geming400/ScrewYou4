package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryFixedCodec.class)
public class RegistryFixedCodec1213268151Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_77807680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77807680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode_894790008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894790008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_321026588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321026588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Lnet/minecraft/core/Holder;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode__1296258999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296258999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/RegistryFixedCodec;", cancellable = true)
    private static void create__2042402116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042402116L))
            info.setReturnValue(null);
    }


}
