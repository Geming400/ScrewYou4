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
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__964608069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964608069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_209114648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209114648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codepoint()I", cancellable = true)
    private void codepoint_209114152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209114152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedChatCharacter()Z", cancellable = true)
    private void isAllowedChatCharacter_209130489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209130489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codepointAsString()Ljava/lang/String;", cancellable = true)
    private void codepointAsString__964608565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964608565L))
            info.setReturnValue(null);
    }


}
