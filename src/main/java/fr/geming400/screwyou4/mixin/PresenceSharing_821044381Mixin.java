package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.PresenceSharing.class)
public class PresenceSharing_821044381Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/PresenceSharing;", cancellable = true)
    private static void values__960659096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960659096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/PresenceSharing;", cancellable = true)
    private static void valueOf_1082847151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082847151L))
            info.setReturnValue(net.minecraft.client.PresenceSharing.LIMITED);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_909253002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909253002L))
            info.setReturnValue("<\u0F1F\uC175B&=z9\u31C5$\u50649}fU\u1071\u04D2ty!e;!^5}P@GM\u86BC+\u4D143WWI7#%W,c]h&\u3407\u5613DnI)\u7856Oh");
    }

    @Inject(at = @At("HEAD"), method = "getTranslation()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTranslation__1419225878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419225878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTooltip()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTooltip__1359994692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1359994692L))
            info.setReturnValue(null);
    }


}
