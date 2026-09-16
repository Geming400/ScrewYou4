package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.GuiMessage.Line.class)
public class Line1945947318Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Lnet/minecraft/client/multiplayer/chat/GuiMessage;", cancellable = true)
    private void parent__1402391440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1402391440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1037321050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037321050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1578596453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578596453L))
            info.setReturnValue("9U!+B! O)0&9\u2B66\u9DBE3 vy\u1866Q>&M 08}_[*^g\u3DA2Gh$ 4[n8*A\u8007im!4 n\u9996\"f6N\u69CF\u642E+'T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1791667887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1791667887L))
            info.setReturnValue(1598105538);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private void tag_345189028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345189028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "content()Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void content__1709317021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709317021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTagIconLeft(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getTagIconLeft_942924708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942924708L))
            info.setReturnValue(-583230060);
    }

    @Inject(at = @At("HEAD"), method = "endOfEntry()Z", cancellable = true)
    private void endOfEntry__780237075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-780237075L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addedTime()I", cancellable = true)
    private void addedTime__688101681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-688101681L))
            info.setReturnValue(375628304);
    }


}
