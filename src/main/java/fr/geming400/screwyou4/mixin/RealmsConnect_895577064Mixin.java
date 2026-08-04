package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.realms.RealmsConnect.class)
public class RealmsConnect_895577064Mixin {
        @Inject(at = @At("HEAD"), method = "connect(Lcom/mojang/realmsclient/dto/RealmsServer;Lnet/minecraft/client/multiplayer/resolver/ServerAddress;)V", cancellable = true)
    private void connect__33258211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-33258211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_933851802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(933851802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "abort()V", cancellable = true)
    private void abort_933851802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(933851802L))
            info.cancel();
    }


}
