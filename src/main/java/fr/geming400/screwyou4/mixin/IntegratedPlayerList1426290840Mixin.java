package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.server.IntegratedPlayerList.class)
public class IntegratedPlayerList1426290840Mixin {
        @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer_1428049735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428049735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/client/server/IntegratedServer;", cancellable = true)
    private void getServer__2035532275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035532275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlayerLogin(Ljava/net/SocketAddress;Lnet/minecraft/server/players/NameAndId;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void canPlayerLogin_1690885561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690885561L))
            info.setReturnValue(null);
    }


}
