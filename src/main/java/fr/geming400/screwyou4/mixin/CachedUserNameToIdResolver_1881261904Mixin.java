package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.CachedUserNameToIdResolver.class)
public class CachedUserNameToIdResolver_1881261904Mixin {
        @Inject(at = @At("HEAD"), method = "get(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void get__410353527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-410353527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/util/UUID;)Ljava/util/Optional;", cancellable = true)
    private void get_774178815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(774178815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/NameAndId;)V", cancellable = true)
    private void add__598619170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-598619170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_2012377765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2012377765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resolveOfflineUsers(Z)V", cancellable = true)
    private void resolveOfflineUsers_1434804029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1434804029L))
            info.cancel();
    }


}
