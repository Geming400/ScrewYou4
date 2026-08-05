package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.RegistryFriendlyByteBuf.class)
public class RegistryFriendlyByteBuf206847669Mixin {
        @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess__848045541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848045541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorator(Lnet/minecraft/core/RegistryAccess;)Ljava/util/function/Function;", cancellable = true)
    private static void decorator_1967481271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967481271L))
            info.setReturnValue(null);
    }


}
