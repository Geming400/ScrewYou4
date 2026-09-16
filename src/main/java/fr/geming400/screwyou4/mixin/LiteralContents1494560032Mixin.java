package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.PlainTextContents.LiteralContents.class)
public class LiteralContents1494560032Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_585933764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585933764L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2029984235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029984235L))
            info.setReturnValue("1IIl)I\uA21D4\uA342sh7z\u14188@ D1Y\uC85DPVv>?0iHGuu[] \uD784GQB\u70F1XuR\u6844bA68QP'u25\u83F2BG14\u94C3fh#n\uA1E2du.J<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2051912123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051912123L))
            info.setReturnValue(-1844578520);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text__769400298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769400298L))
            info.setReturnValue("4t;Xd,\u15A4XigBmmt\u99FB>v!$s2{8^TQ\uCA16kl:H\u520FQ BT%q4^x0");
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$StyledContentConsumer;Lnet/minecraft/network/chat/Style;)Ljava/util/Optional;", cancellable = true)
    private void visit__264321239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-264321239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/network/chat/FormattedText$ContentConsumer;)Ljava/util/Optional;", cancellable = true)
    private void visit__293859428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293859428L))
            info.setReturnValue(null);
    }


}
