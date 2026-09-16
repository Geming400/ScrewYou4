package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.CommandSigningContext.SignedArguments.class)
public class SignedArguments_101730603Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__806895666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-806895666L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_872154127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872154127L))
            info.setReturnValue("\u41AB\uCF31ON n-L_Bu+G*\uA740`#gKmV=\uAE07'x\u10AC.Y071K]A1kXR\u8393yTw UB0\u2B2BgNuDp+XpY>CPRzDR}&=U@CwZ{ ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_659082693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659082693L))
            info.setReturnValue(-847869449);
    }

    @Inject(at = @At("HEAD"), method = "arguments()Ljava/util/Map;", cancellable = true)
    private void arguments__1625746692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1625746692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArgument(Ljava/lang/String;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void getArgument_389248277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389248277L))
            info.setReturnValue(null);
    }


}
