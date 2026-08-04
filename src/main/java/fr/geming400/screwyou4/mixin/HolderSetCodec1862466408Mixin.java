package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.HolderSetCodec.class)
public class HolderSetCodec1862466408Mixin {
        @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode_1543988265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543988265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_970224845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970224845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Lnet/minecraft/core/HolderSet;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_984270388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984270388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;Z)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void create__1993306841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993306841L))
            info.setReturnValue(null);
    }


}
