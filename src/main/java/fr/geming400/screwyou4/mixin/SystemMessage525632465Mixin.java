package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.ServerStateService.SystemMessage.class)
public class SystemMessage525632465Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1911144724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911144724L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__609827510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609827510L))
            info.setReturnValue("6G6r@h\uB83BW9r^biv;%v\uD5B3 3;`o7<?(@>O\uA4F3\u35DACN\uC965/.aB!BruT_\"S+v1{N$Lbrk}B1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_563895207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(563895207L))
            info.setReturnValue(2075037992);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/server/jsonrpc/methods/Message;", cancellable = true)
    private void message__1020598145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020598145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "receivingPlayers()Ljava/util/Optional;", cancellable = true)
    private void receivingPlayers_771093887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771093887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlay()Z", cancellable = true)
    private void overlay_563911048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(563911048L))
            info.setReturnValue(true);
    }


}
