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
            info.setReturnValue("$J1Bgtu)eXh:N븩%{褟9Fi2\"5;uKU$pb1鄿38jDr");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_209114648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209114648L))
            info.setReturnValue(967648959);
    }

    @Inject(at = @At("HEAD"), method = "codepoint()I", cancellable = true)
    private void codepoint_209114152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209114152L))
            info.setReturnValue(1146172449);
    }

    @Inject(at = @At("HEAD"), method = "codepointAsString()Ljava/lang/String;", cancellable = true)
    private void codepointAsString__964608565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964608565L))
            info.setReturnValue("娱8鶑^5+KxX[H<AQ5遂>z䯡+ꑊbnX1뤄Io6<$K)殌tO#i'頱杧쨀뻵Jnyb垥.!⦤\"|ci{\"r次沴C4qc` JWg覎nf옚Ⲅ_)ﰟ/rJ");
    }

    @Inject(at = @At("HEAD"), method = "isAllowedChatCharacter()Z", cancellable = true)
    private void isAllowedChatCharacter_209130489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209130489L))
            info.setReturnValue(false);
    }


}
