package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryFixedCodec.class)
public class RegistryFixedCodec1213268151Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1983691180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983691180L))
            info.setReturnValue("\u10F0f;\u7280v<\u1574U3\u82A1PM!7_\u6970?Ku\u86E6y#Pcb@7{sg\u2C41FJ\u6800<,\u8CE3-NEj\u0204\u957D\uFFFCs,m42zU:+=G\u1C75]M&R'\uC9BDwnkNiH\u34A5r|8+");
    }

    @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode__293711002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293711002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_556930738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556930738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Lnet/minecraft/core/Holder;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode__377170829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377170829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/RegistryFixedCodec;", cancellable = true)
    private static void create__731947200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731947200L))
            info.setReturnValue(null);
    }


}
