package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.OpenUrl.class)
public class OpenUrl_961796059Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1947658979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1947658979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__173663917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173663917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1000058800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000058800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_621399362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621399362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uri()Ljava/net/URI;", cancellable = true)
    private void uri__1580988165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1580988165L))
            info.setReturnValue(null);
    }


}
