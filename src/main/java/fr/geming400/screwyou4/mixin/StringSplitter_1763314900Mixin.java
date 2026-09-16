package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.StringSplitter.class)
public class StringSplitter_1763314900Mixin {
        @Inject(at = @At("HEAD"), method = "plainHeadByWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)Ljava/lang/String;", cancellable = true)
    private void plainHeadByWidth__207078456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207078456L))
            info.setReturnValue("I7\"\u767BF79G%\uD109\uD716\u81321&<i");
    }

    @Inject(at = @At("HEAD"), method = "stringWidth(Lnet/minecraft/network/chat/FormattedText;)F", cancellable = true)
    private void stringWidth_936541481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(936541481L))
            info.setReturnValue(1.683546E8F);
    }

    @Inject(at = @At("HEAD"), method = "stringWidth(Lnet/minecraft/util/FormattedCharSequence;)F", cancellable = true)
    private void stringWidth__739405226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-739405226L))
            info.setReturnValue(1.683546E8F);
    }

    @Inject(at = @At("HEAD"), method = "stringWidth(Ljava/lang/String;)F", cancellable = true)
    private void stringWidth__1546664021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546664021L))
            info.setReturnValue(1.683546E8F);
    }

    @Inject(at = @At("HEAD"), method = "plainTailByWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)Ljava/lang/String;", cancellable = true)
    private void plainTailByWidth__748722632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748722632L))
            info.setReturnValue("SY&>V:'\u03C9xzuO\u7945Lp4K<9')\uC6DA. iz");
    }

    @Inject(at = @At("HEAD"), method = "headByWidth(Lnet/minecraft/network/chat/FormattedText;ILnet/minecraft/network/chat/Style;)Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void headByWidth__1481437990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481437990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findLineBreak(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)I", cancellable = true)
    private void findLineBreak__739627590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-739627590L))
            info.setReturnValue(-1854937501);
    }

    @Inject(at = @At("HEAD"), method = "getWordPosition(Ljava/lang/String;IIZ)I", cancellable = true)
    private static void getWordPosition_455437274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(455437274L))
            info.setReturnValue(527926783);
    }

    @Inject(at = @At("HEAD"), method = "plainIndexAtWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)I", cancellable = true)
    private void plainIndexAtWidth_658008019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658008019L))
            info.setReturnValue(-1943433637);
    }

    @Inject(at = @At("HEAD"), method = "splitLines(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)Ljava/util/List;", cancellable = true)
    private void splitLines__1069487377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069487377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splitLines(Ljava/lang/String;ILnet/minecraft/network/chat/Style;ZLnet/minecraft/client/StringSplitter$LinePosConsumer;)V", cancellable = true)
    private void splitLines_666890669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(666890669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "splitLines(Lnet/minecraft/network/chat/FormattedText;ILnet/minecraft/network/chat/Style;)Ljava/util/List;", cancellable = true)
    private void splitLines__1820232467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820232467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splitLines(Lnet/minecraft/network/chat/FormattedText;ILnet/minecraft/network/chat/Style;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void splitLines_36331219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(36331219L))
            info.cancel();
    }


}
