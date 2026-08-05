package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.HoverEvent.ShowText.class)
public class ShowText47462330Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void value__2129446835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129446835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1432974589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432974589L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1087997645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087997645L))
            info.setReturnValue("RN=H\u13259[cZN\uA4408lq9Yxwn\u7EF2{MV\u44FB<KD\u0C9Di=%w\uC05D\"fX}\"\u5762\u40D9+&pnJCX>\u1B295Iv\u8CEA\uC2BEn;MH2u\u61D5\uC422L");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_85725072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85725072L))
            info.setReturnValue(-1899789508);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/HoverEvent$Action;", cancellable = true)
    private void action__1519662354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519662354L))
            info.setReturnValue(net.minecraft.network.chat.HoverEvent.Action.SHOW_TEXT);
    }


}
