package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.server.LanServerDetection.LanServerList.class)
public class LanServerList_1327929171Mixin {
        @Inject(at = @At("HEAD"), method = "addServer(Ljava/lang/String;Ljava/net/InetAddress;)V", cancellable = true)
    private void addServer__767551555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-767551555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "takeDirtyServers()Ljava/util/List;", cancellable = true)
    private void takeDirtyServers__1340700318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340700318L))
            info.setReturnValue(null);
    }


}
