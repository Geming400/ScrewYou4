package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.JsonRpc.class)
public class JsonRpc_349675537Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/dedicated/DedicatedServerSettings;Lnet/minecraft/server/notifications/NotificationManager;)Lnet/minecraft/server/jsonrpc/ManagementServer;", cancellable = true)
    private static void create__1740623266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740623266L))
            info.setReturnValue(null);
    }


}
