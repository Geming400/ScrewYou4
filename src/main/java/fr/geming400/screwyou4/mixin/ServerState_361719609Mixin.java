package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.ServerStateService.ServerState.class)
public class ServerState_361719609Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__546906660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-546906660L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1132143133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132143133L))
            info.setReturnValue("f7uY61\"\u3356\u9FD2\u773E-{pyg1yZ!Z]p0\u3429.\u00F5pPTm-\uB087JR2*3 !^C(z(BqW\"KUp6qS2=:g9evt=3");
    }

    @Inject(at = @At("HEAD"), method = "version()Lnet/minecraft/network/protocol/status/ServerStatus$Version;", cancellable = true)
    private void version__582470758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582470758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_919071699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919071699L))
            info.setReturnValue(-6859711);
    }

    @Inject(at = @At("HEAD"), method = "started()Z", cancellable = true)
    private void started_907371790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907371790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/List;", cancellable = true)
    private void players_1518619162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518619162L))
            info.setReturnValue(null);
    }


}
