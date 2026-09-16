package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistrySynchronization.class)
public class RegistrySynchronization478206549Mixin {
        @Inject(at = @At("HEAD"), method = "networkedRegistries(Lnet/minecraft/core/LayeredRegistryAccess;)Ljava/util/stream/Stream;", cancellable = true)
    private static void networkedRegistries_411652852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411652852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packRegistries(Lcom/mojang/serialization/DynamicOps;Lnet/minecraft/core/RegistryAccess;Ljava/util/Set;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void packRegistries_966779870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(966779870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "networkSafeRegistries(Lnet/minecraft/core/LayeredRegistryAccess;)Ljava/util/stream/Stream;", cancellable = true)
    private static void networkSafeRegistries_834034982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834034982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isNetworkable(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private static void isNetworkable__1372181242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372181242L))
            info.setReturnValue(true);
    }


}
