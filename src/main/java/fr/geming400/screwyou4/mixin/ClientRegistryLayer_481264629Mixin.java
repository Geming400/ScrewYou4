package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientRegistryLayer.class)
public class ClientRegistryLayer_481264629Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/ClientRegistryLayer;", cancellable = true)
    private static void values_186927311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186927311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/ClientRegistryLayer;", cancellable = true)
    private static void valueOf_1092241292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1092241292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRegistryAccess()Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private static void createRegistryAccess__1380755355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380755355L))
            info.setReturnValue(null);
    }


}
