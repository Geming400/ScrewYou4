package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.ErrorEntry.class)
public class ErrorEntry_1486102816Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_577476547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(577476547L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2038440956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2038440956L))
            info.setReturnValue("23K\uD2BB+4E]r\"'mWgF[&)}W[kys\u9B6F0Y]U|r\uB04DKT(@V\u9D6E`u0H;yg*JrY/\u8C30\u9480L@F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2043454906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043454906L))
            info.setReturnValue(-1769818572);
    }

    @Inject(at = @At("HEAD"), method = "reason()Ljava/lang/Object;", cancellable = true)
    private void reason__595726850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595726850L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "cursor()I", cancellable = true)
    private void cursor__136672913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-136672913L))
            info.setReturnValue(1010047505);
    }

    @Inject(at = @At("HEAD"), method = "suggestions()Lnet/minecraft/util/parsing/packrat/SuggestionSupplier;", cancellable = true)
    private void suggestions__1366292439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366292439L))
            info.setReturnValue(null);
    }


}
