package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.Style.class)
public class Style591719699Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1977231462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977231462L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__543740772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543740772L))
            info.setReturnValue("oxJVC`淹.3s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_629981945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629981945L))
            info.setReturnValue(1076685316);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_629998282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629998282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "applyTo(Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void applyTo_442054674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442054674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/network/chat/TextColor;", cancellable = true)
    private void getColor__1983109683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983109683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isItalic()Z", cancellable = true)
    private void isItalic_629998282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629998282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withBold(Ljava/lang/Boolean;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withBold_369984207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369984207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withItalic(Ljava/lang/Boolean;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withItalic_369984207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369984207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withColor(Lnet/minecraft/network/chat/TextColor;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withColor_2067872727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067872727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withColor(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withColor__67310348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67310348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withColor(I)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withColor_77432473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77432473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFont()Lnet/minecraft/network/chat/FontDescription;", cancellable = true)
    private void getFont__468340938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468340938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBold()Z", cancellable = true)
    private void isBold_629998282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629998282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withFont(Lnet/minecraft/network/chat/FontDescription;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withFont_2143335182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2143335182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyFormats([Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void applyFormats__626741367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626741367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyFormat(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void applyFormat__67310348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67310348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withoutShadow()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withoutShadow_282113010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(282113010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShadowColor()Ljava/lang/Integer;", cancellable = true)
    private void getShadowColor__588701203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588701203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isObfuscated()Z", cancellable = true)
    private void isObfuscated_629998282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629998282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withClickEvent(Lnet/minecraft/network/chat/ClickEvent;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withClickEvent__611091953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611091953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withInsertion(Ljava/lang/String;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withInsertion__1240841944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1240841944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withShadowColor(I)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withShadowColor_77432473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77432473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStrikethrough()Z", cancellable = true)
    private void isStrikethrough_629998282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629998282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getInsertion()Ljava/lang/String;", cancellable = true)
    private void getInsertion__543740772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543740772L))
            info.setReturnValue("oxJVC`淹.3s");
    }

    @Inject(at = @At("HEAD"), method = "applyLegacyFormat(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void applyLegacyFormat__67310348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67310348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClickEvent()Lnet/minecraft/network/chat/ClickEvent;", cancellable = true)
    private void getClickEvent_436764163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436764163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHoverEvent()Lnet/minecraft/network/chat/HoverEvent;", cancellable = true)
    private void getHoverEvent_1606127031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606127031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStrikethrough(Ljava/lang/Boolean;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withStrikethrough_369984207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369984207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isUnderlined()Z", cancellable = true)
    private void isUnderlined_629998282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629998282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withObfuscated(Ljava/lang/Boolean;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withObfuscated_369984207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369984207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUnderlined(Ljava/lang/Boolean;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withUnderlined_369984207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369984207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withHoverEvent(Lnet/minecraft/network/chat/HoverEvent;)Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void withHoverEvent_1371647451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371647451L))
            info.setReturnValue(null);
    }


}
