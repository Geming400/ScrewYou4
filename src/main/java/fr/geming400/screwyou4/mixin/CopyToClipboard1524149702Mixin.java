package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.CopyToClipboard.class)
public class CopyToClipboard1524149702Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value_1820943360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820943360L))
            info.setReturnValue("r");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_615523434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615523434L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2000394069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000394069L))
            info.setReturnValue("m,\uA4EE&'af OT\u1E5A\uC739zP`%b_\"\uD753u\u4CE6Bqhc;=eq(!n?\"\u6248\u665F\u26E6DI?aY4\uB3BA=\uB336*GZUT1qE5'QY<\uC8CBN(V)>=Oq{UHvOi:Q\u4BE7{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2081501793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081501793L))
            info.setReturnValue(-1280808086);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1610278884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610278884L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.OPEN_URL);
    }


}
