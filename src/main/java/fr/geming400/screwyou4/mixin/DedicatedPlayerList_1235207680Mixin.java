package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dedicated.DedicatedPlayerList.class)
public class DedicatedPlayerList_1235207680Mixin {
        @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer_148251061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(148251061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/dedicated/DedicatedServer;", cancellable = true)
    private void getServer__449940525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-449940525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWhiteListed(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void isWhiteListed_2040414355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040414355L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBypassPlayerLimit(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void canBypassPlayerLimit_2040414355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040414355L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "reloadWhiteList()V", cancellable = true)
    private void reloadWhiteList_1273482418(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273482418L))
            info.cancel();
    }


}
