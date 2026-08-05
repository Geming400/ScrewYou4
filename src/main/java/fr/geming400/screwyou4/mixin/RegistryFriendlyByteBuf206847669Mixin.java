package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.RegistryFriendlyByteBuf.class)
public class RegistryFriendlyByteBuf206847669Mixin {
        @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_216324412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216324412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorator(Lnet/minecraft/core/RegistryAccess;)Ljava/util/function/Function;", cancellable = true)
    private static void decorator__1927538948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927538948L))
            info.setReturnValue(null);
    }


}
