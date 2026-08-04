package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistrySynchronization.class)
public class RegistrySynchronization478206549Mixin {
        @Inject(at = @At("HEAD"), method = "isNetworkable(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private static void isNetworkable_665879944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665879944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packRegistries(Lcom/mojang/serialization/DynamicOps;Lnet/minecraft/core/RegistryAccess;Ljava/util/Set;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void packRegistries__968570638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-968570638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "networkedRegistries(Lnet/minecraft/core/LayeredRegistryAccess;)Ljava/util/stream/Stream;", cancellable = true)
    private static void networkedRegistries__696034116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696034116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "networkSafeRegistries(Lnet/minecraft/core/LayeredRegistryAccess;)Ljava/util/stream/Stream;", cancellable = true)
    private static void networkSafeRegistries__696034116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696034116L))
            info.setReturnValue(null);
    }


}
