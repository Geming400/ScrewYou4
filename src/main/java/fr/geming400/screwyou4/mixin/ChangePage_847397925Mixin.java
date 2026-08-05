package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.ChangePage.class)
public class ChangePage_847397925Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2062057113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062057113L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__288062051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-288062051L))
            info.setReturnValue("N@8q]I\u0F64\u8470)2a2*3h)yr#6e*zS\u9B8Aab_}!+6;QT<76JY+F1YRHJ2AbT'2%J>LU1Iv\uAC75}O \"Mui9#\u901C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_885660666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(885660666L))
            info.setReturnValue(-171125949);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_507001228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507001228L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.CUSTOM);
    }

    @Inject(at = @At("HEAD"), method = "page()I", cancellable = true)
    private void page_885660170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(885660170L))
            info.setReturnValue(-288089614);
    }


}
