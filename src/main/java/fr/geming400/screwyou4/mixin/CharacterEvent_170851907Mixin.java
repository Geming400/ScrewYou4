package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.input.CharacterEvent.class)
public class CharacterEvent_170851907Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1556364165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556364165L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__964608069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964608069L))
            info.setReturnValue("$J1Bgtu)eXh:N\uBE29%{\u891F9Fi2\"5;uKU$pb1\u913F38jDr");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_209114648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209114648L))
            info.setReturnValue(457908459);
    }

    @Inject(at = @At("HEAD"), method = "codepoint()I", cancellable = true)
    private void codepoint_209114152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209114152L))
            info.setReturnValue(636431949);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedChatCharacter()Z", cancellable = true)
    private void isAllowedChatCharacter_209130489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209130489L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codepointAsString()Ljava/lang/String;", cancellable = true)
    private void codepointAsString__964608565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964608565L))
            info.setReturnValue("\u5A318\u9D91^5+KxX[H<AQ5\u9042>z\u4BE1+\uA44AbnX1\uB904Io6<$K)\u6B8CtO#i'\u9831\u6767\uCA00\uBEF5Jnyb\u57A5.!\u29A4\"|ci{\"r\u6B21\u6CB4C4qc` JWg\u898Enf\uC61A\u2C84_)\uFC1F/rJ");
    }


}
