package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.StringSplitter.class)
public class StringSplitter_1763314900Mixin {
        @Inject(at = @At("HEAD"), method = "plainHeadByWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)Ljava/lang/String;", cancellable = true)
    private void plainHeadByWidth_809480813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809480813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plainIndexAtWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)I", cancellable = true)
    private void plainIndexAtWidth_2119726216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119726216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plainTailByWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)Ljava/lang/String;", cancellable = true)
    private void plainTailByWidth_809480813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809480813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringWidth(Ljava/lang/String;)F", cancellable = true)
    private void stringWidth__1379306624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379306624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringWidth(Lnet/minecraft/network/chat/FormattedText;)F", cancellable = true)
    private void stringWidth_1718303230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718303230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringWidth(Lnet/minecraft/util/FormattedCharSequence;)F", cancellable = true)
    private void stringWidth_42356523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(42356523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findLineBreak(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)I", cancellable = true)
    private void findLineBreak_2119726216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119726216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWordPosition(Ljava/lang/String;IIZ)I", cancellable = true)
    private static void getWordPosition__760113071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760113071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "headByWidth(Lnet/minecraft/network/chat/FormattedText;ILnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void headByWidth_105638889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(105638889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splitLines(Ljava/lang/String;ILnet/minecraft/network/chat/Style;ZLnet/minecraft/client/StringSplitter$LinePosConsumer;)V", cancellable = true)
    private void splitLines_2032956328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2032956328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "splitLines(Lnet/minecraft/network/chat/FormattedText;ILnet/minecraft/network/chat/Style;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void splitLines__565306312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-565306312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "splitLines(Lnet/minecraft/network/chat/FormattedText;ILnet/minecraft/network/chat/Style;)Ljava/util/List;", cancellable = true)
    private void splitLines__171008942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171008942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splitLines(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)Ljava/util/List;", cancellable = true)
    private void splitLines__1343114924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343114924L))
            info.setReturnValue(null);
    }


}
