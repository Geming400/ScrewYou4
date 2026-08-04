package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistryCodecs.class)
public class RegistryCodecs_1618359610Mixin {
        @Inject(at = @At("HEAD"), method = "homogeneousList(Lnet/minecraft/resources/ResourceKey;Z)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void homogeneousList_1484774833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484774833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "homogeneousList(Lnet/minecraft/resources/ResourceKey;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void homogeneousList_18883955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18883955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "homogeneousList(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;Z)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void homogeneousList_2057553656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2057553656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "homogeneousList(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void homogeneousList_868644684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868644684L))
            info.setReturnValue(null);
    }


}
