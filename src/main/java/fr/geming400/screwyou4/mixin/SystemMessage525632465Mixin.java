package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.ServerStateService.SystemMessage.class)
public class SystemMessage525632465Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__382993803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382993803L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1296055990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1296055990L))
            info.setReturnValue("*9'3qvnKtX{@|n(\u0698vVzJ<t/Bs9NB=lw\u3EBCG*K");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1082984556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082984556L))
            info.setReturnValue(-753007613);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/server/jsonrpc/methods/Message;", cancellable = true)
    private void message_606320838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606320838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlay()Z", cancellable = true)
    private void overlay_758548280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(758548280L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "receivingPlayers()Ljava/util/Optional;", cancellable = true)
    private void receivingPlayers__840009167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-840009167L))
            info.setReturnValue(null);
    }


}
