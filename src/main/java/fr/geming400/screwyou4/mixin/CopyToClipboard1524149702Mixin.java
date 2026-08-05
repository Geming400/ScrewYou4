package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.CopyToClipboard.class)
public class CopyToClipboard1524149702Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value_388689231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388689231L))
            info.setReturnValue("}t\uC7E3n/5?8tAnxa3 \u9B09&>=\u0646P`iu}aI%)f8><sgp1kDzM!i`z\uA098r\u8CB24J}NMIZ-\uCFAB1Sm");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1385305335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385305335L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_388689727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388689727L))
            info.setReturnValue("x:\uAE1B%B5\u3C7FgD-alk\uD11B#\uB74E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1562412444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562412444L))
            info.setReturnValue(-1401006639);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1183753006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183753006L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.OPEN_URL);
    }


}
