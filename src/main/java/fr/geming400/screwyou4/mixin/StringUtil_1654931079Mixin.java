package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StringUtil.class)
public class StringUtil_1654931079Mixin {
        @Inject(at = @At("HEAD"), method = "isWhitespace(I)Z", cancellable = true)
    private static void isWhitespace__1426115154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1426115154L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBlank(Ljava/lang/String;)Z", cancellable = true)
    private static void isBlank__1487670977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487670977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isValidPlayerName(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidPlayerName__1487670977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487670977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedChatCharacter(I)Z", cancellable = true)
    private static void isAllowedChatCharacter__1426115154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1426115154L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "lineCount(Ljava/lang/String;)I", cancellable = true)
    private static void lineCount__1487687314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487687314L))
            info.setReturnValue(312083252);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty(Ljava/lang/String;)Z", cancellable = true)
    private static void isNullOrEmpty__1487670977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487670977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "filterText(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void filterText__1427294147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427294147L))
            info.setReturnValue("$MRe9$Dyvo1/vt(`30>\u1CD3&wE2\uF990akN<V,1FPC<\uBC40n]z>\uFC72`8 %`I\u04D2{");
    }

    @Inject(at = @At("HEAD"), method = "filterText(Ljava/lang/String;Z)Ljava/lang/String;", cancellable = true)
    private static void filterText__273329721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273329721L))
            info.setReturnValue("[oI.Ni*`N\uB2C2ib_[0J)2\uC09BrMsUn\u53C3&$+7U^5cGQ\u3E55ir");
    }

    @Inject(at = @At("HEAD"), method = "truncateStringIfNecessary(Ljava/lang/String;IZ)Ljava/lang/String;", cancellable = true)
    private static void truncateStringIfNecessary_1453669420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453669420L))
            info.setReturnValue("ExI>\u1856<Dhs0AZ|?cAqvef'}PwM\uA35EL/%\uD6D2");
    }

    @Inject(at = @At("HEAD"), method = "endsWithNewLine(Ljava/lang/String;)Z", cancellable = true)
    private static void endsWithNewLine__1487670977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487670977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stripColor(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void stripColor__1427294147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427294147L))
            info.setReturnValue("$MRe9$Dyvo1/vt(`30>\u1CD3&wE2\uF990akN<V,1FPC<\uBC40n]z>\uFC72`8 %`I\u04D2{");
    }

    @Inject(at = @At("HEAD"), method = "formatTickDuration(IF)Ljava/lang/String;", cancellable = true)
    private static void formatTickDuration_1795515402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795515402L))
            info.setReturnValue("l\u5A01ryi\u47C9s!M}pU87@E3FIs");
    }

    @Inject(at = @At("HEAD"), method = "trimChatMessage(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void trimChatMessage__1427294147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427294147L))
            info.setReturnValue("$MRe9$Dyvo1/vt(`30>\u1CD3&wE2\uF990akN<V,1FPC<\uBC40n]z>\uFC72`8 %`I\u04D2{");
    }


}
