package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.resolver.ServerNameResolver.class)
public class ServerNameResolver_383791764Mixin {
        @Inject(at = @At("HEAD"), method = "resolveAddress(Lnet/minecraft/client/multiplayer/resolver/ServerAddress;)Ljava/util/Optional;", cancellable = true)
    private void resolveAddress_1498739535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498739535L))
            info.setReturnValue(null);
    }


}
