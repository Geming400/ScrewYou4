package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.PlainTextContents.LiteralContents.class)
public class LiteralContents1494560032Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1414895005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1414895005L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_359099561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(359099561L))
            info.setReturnValue("n3%k싂x@幑LM+쀚^R߇E-鑂kj|YQai;P2Uz?d.겝<?,t.W.<⤰[ᒋ@텎JkF1l骃fRL8J餸{&6륤>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1532822774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1532822774L))
            info.setReturnValue(104453840);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text_359099561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(359099561L))
            info.setReturnValue("n3%k싂x@幑LM+쀚^R߇E-鑂kj|YQai;P2Uz?d.겝<?,t.W.<⤰[ᒋ@텎JkF1l骃fRL8J餸{&6륤>");
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$StyledContentConsumer;Lnet/minecraft/network/chat/Style;)Ljava/util/Optional;", cancellable = true)
    private void visit__410544738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-410544738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$ContentConsumer;)Ljava/util/Optional;", cancellable = true)
    private void visit_1644443409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1644443409L))
            info.setReturnValue(null);
    }


}
