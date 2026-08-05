package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatRestriction.Action.class)
public class Action728035186Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2113547445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113547445L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__407424789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407424789L))
            info.setReturnValue("3pA1xD]@F\u7DCE\uB69A>*NAt? tNbG#|EF;a[\u5B4ED}lq!V^%C?$\u95DF=d7\u92CD]<%jZ]k4X\uC2CE6\u44BBM5e<9}*iJj]\"\u4918^M2tC\u4AC7*\uA0A9M:AsBO,)r\u916F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_766297928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766297928L))
            info.setReturnValue(-569595871);
    }

    @Inject(at = @At("HEAD"), method = "runnable()Ljava/util/function/BiConsumer;", cancellable = true)
    private void runnable_1550947970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550947970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void title__1448873979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448873979L))
            info.setReturnValue(null);
    }


}
