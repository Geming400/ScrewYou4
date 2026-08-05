package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.ServerStateService.ServerState.class)
public class ServerState_361719609Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1747231867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747231867L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__773740367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773740367L))
            info.setReturnValue("w2㾌쬬WeQa鱪:0leOdሚKk");
    }

    @Inject(at = @At("HEAD"), method = "version()Lnet/minecraft/network/protocol/status/ServerStatus$Version;", cancellable = true)
    private void version_1705367234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705367234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_399982350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399982350L))
            info.setReturnValue(99191090);
    }

    @Inject(at = @At("HEAD"), method = "started()Z", cancellable = true)
    private void started_399998191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399998191L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/List;", cancellable = true)
    private void players_1988056424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1988056424L))
            info.setReturnValue(null);
    }


}
