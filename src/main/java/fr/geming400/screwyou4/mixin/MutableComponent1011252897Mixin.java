package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.MutableComponent.class)
public class MutableComponent1011252897Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_102626133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(102626133L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1781675926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781675926L))
            info.setReturnValue("W&U`EO\u0EA7ekSngP&)pN");
    }

    @Inject(at = @At("HEAD"), method = "append(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void append__1668947226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668947226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "append(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void append_1028451292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028451292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1568604492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1568604492L))
            info.setReturnValue(840656025);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/ComponentContents;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private static void create__709782846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709782846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContents()Lnet/minecraft/network/chat/ComponentContents;", cancellable = true)
    private void getContents__1407526838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407526838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStyle()Lnet/minecraft/network/chat/Style;", cancellable = true)
    private void getStyle_1363359035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1363359035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStyle([Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withStyle__1127907904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127907904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStyle(Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withStyle_902701473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902701473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStyle(Ljava/util/function/UnaryOperator;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withStyle_1092425620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1092425620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withStyle(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withStyle__803078657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803078657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVisualOrderText()Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void getVisualOrderText__2090825510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090825510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSiblings()Ljava/util/List;", cancellable = true)
    private void getSiblings_423731896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423731896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withColor(Lnet/minecraft/network/chat/TextColor;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withColor_1650091082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650091082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withColor(I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withColor_595837986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595837986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStyle(Lnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void setStyle__37013187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37013187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withoutShadow()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void withoutShadow_1949615396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1949615396L))
            info.setReturnValue(null);
    }


}
