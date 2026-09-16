package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.ServerOpList.class)
public class ServerOpList1142189502Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void remove_249558606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249558606L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;)Z", cancellable = true)
    private void remove__1906879539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906879539L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_356361796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(356361796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/ServerOpListEntry;)Z", cancellable = true)
    private void add__623777240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623777240L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/players/StoredUserEntry;)Z", cancellable = true)
    private void add_843805108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843805108L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBypassPlayerLimit(Lnet/minecraft/server/players/NameAndId;)Z", cancellable = true)
    private void canBypassPlayerLimit__1841076688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1841076688L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUserList()[Ljava/lang/String;", cancellable = true)
    private void getUserList__1453343263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1453343263L))
            info.setReturnValue(null);
    }


}
