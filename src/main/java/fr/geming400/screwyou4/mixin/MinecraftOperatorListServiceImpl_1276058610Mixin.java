package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.internalapi.MinecraftOperatorListServiceImpl.class)
public class MinecraftOperatorListServiceImpl_1276058610Mixin {
        @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void clear__506998552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-506998552L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "op(Lnet/minecraft/server/players/NameAndId;Ljava/util/Optional;Ljava/util/Optional;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void op_1589384225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1589384225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "op(Lnet/minecraft/server/players/NameAndId;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void op__1353891521(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1353891521L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntries()Ljava/util/Collection;", cancellable = true)
    private void getEntries__717968325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-717968325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deop(Lnet/minecraft/server/players/NameAndId;Lnet/minecraft/server/jsonrpc/methods/ClientInfo;)V", cancellable = true)
    private void deop_1359905216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1359905216L))
            info.cancel();
    }


}
