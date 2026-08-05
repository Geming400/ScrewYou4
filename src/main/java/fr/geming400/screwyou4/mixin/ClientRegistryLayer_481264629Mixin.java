package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientRegistryLayer.class)
public class ClientRegistryLayer_481264629Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/ClientRegistryLayer;", cancellable = true)
    private static void values__1990619539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1990619539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ClientRegistryLayer;", cancellable = true)
    private static void valueOf_631738036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631738036L))
            info.setReturnValue(net.minecraft.client.multiplayer.ClientRegistryLayer.STATIC);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryAccess()Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private static void createRegistryAccess_1290838466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290838466L))
            info.setReturnValue(null);
    }


}
