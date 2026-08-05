package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.HolderSetCodec.class)
public class HolderSetCodec1862466408Mixin {
        @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode_355487255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355487255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_1206128995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206128995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Lnet/minecraft/core/HolderSet;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_1123430858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123430858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;Z)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void create_2093568803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2093568803L))
            info.setReturnValue(null);
    }


}
