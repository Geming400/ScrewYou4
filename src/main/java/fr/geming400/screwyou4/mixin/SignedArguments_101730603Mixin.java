package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.CommandSigningContext.SignedArguments.class)
public class SignedArguments_101730603Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1487242861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487242861L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1033729373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033729373L))
            info.setReturnValue("QX弼}噳↘a4@Eꃱp,R鍆sQW+t7G@-9WX욾(>l2`MꩲW琂(,lkEŵ1$ME亄F髣f鍾;RU䌉_I#)P1UX(/SK8!;a@|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_139993344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139993344L))
            info.setReturnValue(48962572);
    }

    @Inject(at = @At("HEAD"), method = "arguments()Ljava/util/Map;", cancellable = true)
    private void arguments__1902893038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902893038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArgument(Ljava/lang/String;)Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void getArgument__1343733150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343733150L))
            info.setReturnValue(null);
    }


}
