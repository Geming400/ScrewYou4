package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.DedicatedPlayerList.class)
public class DedicatedPlayerList_1235207680Mixin {
        @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer_1236966574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236966574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/dedicated/DedicatedServer;", cancellable = true)
    private void getServer_682904460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682904460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBypassPlayerLimit(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void canBypassPlayerLimit__1748058511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748058511L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isWhiteListed(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isWhiteListed_416399959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416399959L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "reloadWhiteList()V", cancellable = true)
    private void reloadWhiteList__528757084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-528757084L))
            info.cancel();
    }


}
