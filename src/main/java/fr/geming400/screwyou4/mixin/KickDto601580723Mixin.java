package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.PlayerService.KickDto.class)
public class KickDto601580723Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__307045545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307045545L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1372004248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372004248L))
            info.setReturnValue("iB\uA2ECce;bs8'!JizP:)\u2140o\u4078muk&)B\u5218 &bomE6YK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1158932814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158932814L))
            info.setReturnValue(-2085703874);
    }

    @Inject(at = @At("HEAD"), method = "message()Ljava/util/Optional;", cancellable = true)
    private void message__1212550808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1212550808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private void player_1634991811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634991811L))
            info.setReturnValue(null);
    }


}
