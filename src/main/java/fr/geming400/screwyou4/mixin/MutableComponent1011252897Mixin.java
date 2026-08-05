package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.MutableComponent.class)
public class MutableComponent1011252897Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1898202636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1898202636L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__124207574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124207574L))
            info.setReturnValue("첣iE壘쇨oF=K,䖬;a+Sj9c{>X諤竟cᆴ`Anx-e!");
    }

    @Inject(at = @At("HEAD"), method = "append(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void append__1540669632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1540669632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "append(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void append_829716790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829716790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1049515143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049515143L))
            info.setReturnValue(1787721212);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/ComponentContents;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void create_1829401406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829401406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContents()Lnet/minecraft/network/chat/ComponentContents;", cancellable = true)
    private void getContents_778470330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778470330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withoutShadow()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withoutShadow__1396751316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1396751316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void getStyle_701646208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701646208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStyle(Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withStyle_1840311308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840311308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStyle(Ljava/util/function/UnaryOperator;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withStyle_2030035455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030035455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStyle(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withStyle__347556374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-347556374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStyle([Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withStyle_108380981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108380981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVisualOrderText()Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void getVisualOrderText_2070891925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070891925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSiblings()Ljava/util/List;", cancellable = true)
    private void getSiblings__1657377583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657377583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStyle(Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void setStyle_1840311308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840311308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withColor(Lnet/minecraft/network/chat/TextColor;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withColor__328381657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328381657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withColor(I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withColor_1610486565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610486565L))
            info.setReturnValue(null);
    }


}
