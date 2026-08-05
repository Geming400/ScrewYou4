package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.ServerOpList.class)
public class ServerOpList1142189502Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove__1767137071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767137071L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void remove_1947396178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947396178L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1180464241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1180464241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/StoredUserEntry;)Z", cancellable = true)
    private void add_978768885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978768885L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/ServerOpListEntry;)Z", cancellable = true)
    private void add_227393577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(227393577L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUserList()[Ljava/lang/String;", cancellable = true)
    private void getUserList__1802744512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802744512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBypassPlayerLimit(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void canBypassPlayerLimit_1947396178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947396178L))
            info.setReturnValue(false);
    }


}
