package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.CachedUserNameToIdResolver.class)
public class CachedUserNameToIdResolver_1881261904Mixin {
        @Inject(at = @At("HEAD"), method = "get(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void get__403669837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-403669837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/util/UUID;)Ljava/util/Optional;", cancellable = true)
    private void get_1297090217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297090217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void add__1608502561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1608502561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_1919536642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1919536642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resolveOfflineUsers(Z)V", cancellable = true)
    private void resolveOfflineUsers__1184088564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1184088564L))
            info.cancel();
    }


}
