package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.PlayerService.KickDto.class)
public class KickDto601580723Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1987092982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987092982L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__533879252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533879252L))
            info.setReturnValue("8udI;iQY6-:Tf`A>:xc'}yh탕4;Ki訹'ILw䔶h쵇");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_639843465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(639843465L))
            info.setReturnValue(1395900801);
    }

    @Inject(at = @At("HEAD"), method = "message()Ljava/util/Optional;", cancellable = true)
    private void message_847042145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847042145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private void player__241104414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241104414L))
            info.setReturnValue(null);
    }


}
