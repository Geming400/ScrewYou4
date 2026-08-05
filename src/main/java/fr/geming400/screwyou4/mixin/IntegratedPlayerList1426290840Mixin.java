package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.server.IntegratedPlayerList.class)
public class IntegratedPlayerList1426290840Mixin {
        @Inject(at = @At("HEAD"), method = "canPlayerLogin(Ljava/net/SocketAddress;Lnet/minecraft/server/players/NameAndId;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void canPlayerLogin_1511378081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511378081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer_339334222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339334222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/client/server/IntegratedServer;", cancellable = true)
    private void getServer__1773024236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773024236L))
            info.setReturnValue(null);
    }


}
