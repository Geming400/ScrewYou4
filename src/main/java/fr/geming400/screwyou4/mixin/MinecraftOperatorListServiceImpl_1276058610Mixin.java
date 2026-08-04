package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftOperatorListServiceImpl.class)
public class MinecraftOperatorListServiceImpl_1276058610Mixin {
        @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void clear_1189672539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1189672539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "op(Lnet/minecraft/server/players/NameAndId;Ljava/util/Optional;Ljava/util/Optional;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void op_986891008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(986891008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "op(Lnet/minecraft/server/players/NameAndId;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void op__1203012834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1203012834L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntries()Ljava/util/Collection;", cancellable = true)
    private void getEntries__537589663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537589663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deop(Lnet/minecraft/server/players/NameAndId;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void deop__1203012834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1203012834L))
            info.cancel();
    }


}
