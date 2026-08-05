package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistryCodecs.class)
public class RegistryCodecs_1618359610Mixin {
        @Inject(at = @At("HEAD"), method = "homogeneousList(Lnet/minecraft/resources/ResourceKey;Z)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void homogeneousList__1924259394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924259394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "homogeneousList(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void homogeneousList_1017293766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017293766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "homogeneousList(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;Z)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void homogeneousList__1453943035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1453943035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "homogeneousList(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void homogeneousList__1599934049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599934049L))
            info.setReturnValue(null);
    }


}
