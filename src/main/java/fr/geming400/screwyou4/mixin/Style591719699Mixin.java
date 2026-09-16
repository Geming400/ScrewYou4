package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.Style.class)
public class Style591719699Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__316907065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316907065L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1362142728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362142728L))
            info.setReturnValue("\u4496h:$\"Y%iw/{D4R2\uC4EEL\u9F75}l'-ubVbt2kC\u6FFB2\u014C\"i%+Q0\"\uBF46YZ8\u348F_Yr\u2FCBw7]m\u2F10X|*.{rx\uB9C7$77@\u808C!wxu5*A-Jx==x:$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1149071294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1149071294L))
            info.setReturnValue(-1893194625);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1650836071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650836071L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withInsertion(Ljava/lang/String;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withInsertion__8212815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-8212815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withClickEvent(Lnet/minecraft/network/chat/ClickEvent;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withClickEvent_343550391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343550391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withHoverEvent(Lnet/minecraft/network/chat/HoverEvent;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withHoverEvent__7160777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-7160777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/network/chat/TextColor;", cancellable = true)
    private void getColor__949054662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949054662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyTo(Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void applyTo_1712734619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712734619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withFont(Lnet/minecraft/network/chat/FontDescription;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withFont_713074179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713074179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFont()Lnet/minecraft/network/chat/FontDescription;", cancellable = true)
    private void getFont_1145087483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145087483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBold()Z", cancellable = true)
    private void isBold_879023451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879023451L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withColor(I)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withColor_991728060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991728060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withColor(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withColor_752433329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(752433329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withColor(Lnet/minecraft/network/chat/TextColor;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withColor__1826063724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826063724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isItalic()Z", cancellable = true)
    private void isItalic__253672688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253672688L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withBold(Ljava/lang/Boolean;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withBold_1837506756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837506756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withItalic(Ljava/lang/Boolean;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withItalic__2025020167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025020167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyFormat(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void applyFormat_2053494649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053494649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStrikethrough(Ljava/lang/Boolean;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withStrikethrough__943385662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943385662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withObfuscated(Ljava/lang/Boolean;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withObfuscated__556842523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556842523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStrikethrough()Z", cancellable = true)
    private void isStrikethrough_568353441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568353441L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applyLegacyFormat(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void applyLegacyFormat_2114336162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114336162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withoutShadow()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withoutShadow__457040390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457040390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isObfuscated()Z", cancellable = true)
    private void isObfuscated_1918193660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918193660L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withShadowColor(I)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withShadowColor__657347972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-657347972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShadowColor()Ljava/lang/Integer;", cancellable = true)
    private void getShadowColor__1544706464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544706464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyFormats([Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void applyFormats__280464325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280464325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUnderlined(Ljava/lang/Boolean;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withUnderlined_1882981393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882981393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClickEvent()Lnet/minecraft/network/chat/ClickEvent;", cancellable = true)
    private void getClickEvent__1462521061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462521061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isUnderlined()Z", cancellable = true)
    private void isUnderlined_4952104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(4952104L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getHoverEvent()Lnet/minecraft/network/chat/HoverEvent;", cancellable = true)
    private void getHoverEvent__2007167357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007167357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInsertion()Ljava/lang/String;", cancellable = true)
    private void getInsertion_1604787157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604787157L))
            info.setReturnValue("*Q{NTm6q`-%\u2F65l)d\uC19C=)[v@|\u6764V)*P\u741D\u965EwDXO0}\u161D1\u3540j<It3\u7620xH<pRyi\u2F19\u8098TF/^efFf\u0116d\u866FdS(\"\u2F51,}X[\u24D7h2[[0Mk@");
    }


}
