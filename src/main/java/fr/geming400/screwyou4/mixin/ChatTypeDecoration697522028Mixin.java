package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ChatTypeDecoration.class)
public class ChatTypeDecoration697522028Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__211104240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-211104240L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1467945553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467945553L))
            info.setReturnValue("s#+&\u2AB5f=}skg}\u674D-oAwf-xLiX) \u0785.EG^7q\u27EBtw0c%H9UW;.f:j%t\u37DA]z'%)6XNdu;Py+29]8)0\uA280zj^.,,lbOt");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1254874119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254874119L))
            info.setReturnValue(-237997697);
    }

    @Inject(at = @At("HEAD"), method = "parameters()Ljava/util/List;", cancellable = true)
    private void parameters_1765863046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765863046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "style()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void style__216568004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216568004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outgoingDirectMessage(Ljava/lang/String;)Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private static void outgoingDirectMessage_876830012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876830012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "incomingDirectMessage(Ljava/lang/String;)Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private static void incomingDirectMessage__430876810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430876810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teamMessage(Ljava/lang/String;)Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private static void teamMessage__2138093276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138093276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translationKey()Ljava/lang/String;", cancellable = true)
    private void translationKey_935836259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(935836259L))
            info.setReturnValue("\u69F7K\u152C[?ic|!ZQ:n{+OEos\uD1C3wy>\u7BA1?M1ghotI)yog%\u53CE/IE[i\"Cr6g?Gs");
    }

    @Inject(at = @At("HEAD"), method = "withSender(Ljava/lang/String;)Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private static void withSender__510898157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-510898157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorate(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/ChatType$Bound;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void decorate_908635389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908635389L))
            info.setReturnValue(null);
    }


}
