package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.HoverEvent.Action.class)
public class Action_628535898Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1398958926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398958926L))
            info.setReturnValue("vtJ-z\uBC84f!y$\u41B42:}aTJdTFAyvM_>\u703BN\u8BA7nU)?\u2BC8)>fi!\u7A46\u6872\u14A1\u13E3\u6BEAX&WxMZ+T\u0398BW<i\"3pi**r/N)Tn\u8FBF\u879F\"u>^@)hQp28S\u084Fk_*");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/chat/HoverEvent$Action;", cancellable = true)
    private static void values__1497339236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497339236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/chat/HoverEvent$Action;", cancellable = true)
    private static void valueOf__1975868957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1975868957L))
            info.setReturnValue(net.minecraft.network.chat.HoverEvent.Action.SHOW_TEXT);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedFromServer()Z", cancellable = true)
    private void isAllowedFromServer__1894515803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1894515803L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_716744519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(716744519L))
            info.setReturnValue("\u6304:N]#r]lSDF7q6r");
    }


}
