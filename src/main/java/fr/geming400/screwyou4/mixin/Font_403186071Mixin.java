package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.Font.class)
public class Font_403186071Mixin {
        @Inject(at = @At("HEAD"), method = "split(Lnet/minecraft/network/chat/FormattedText;I)Ljava/util/List;", cancellable = true)
    private void split__151101259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151101259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width(Ljava/lang/String;)I", cancellable = true)
    private void width_1555534726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555534726L))
            info.setReturnValue(-474043238);
    }

    @Inject(at = @At("HEAD"), method = "width(Lnet/minecraft/network/chat/FormattedText;)I", cancellable = true)
    private void width_358177284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358177284L))
            info.setReturnValue(1855275911);
    }

    @Inject(at = @At("HEAD"), method = "width(Lnet/minecraft/util/FormattedCharSequence;)I", cancellable = true)
    private void width__1317769423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1317769423L))
            info.setReturnValue(-125077185);
    }

    @Inject(at = @At("HEAD"), method = "wordWrapHeight(Lnet/minecraft/network/chat/FormattedText;I)I", cancellable = true)
    private void wordWrapHeight__964311443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964311443L))
            info.setReturnValue(506648726);
    }

    @Inject(at = @At("HEAD"), method = "prepareText(Lnet/minecraft/util/FormattedCharSequence;FFIZZI)Lnet/minecraft/client/gui/Font$PreparedText;", cancellable = true)
    private void prepareText_1455397428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455397428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareText(Ljava/lang/String;FFIZI)Lnet/minecraft/client/gui/Font$PreparedText;", cancellable = true)
    private void prepareText__1916377589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916377589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepare8xTextOutline(Lnet/minecraft/util/FormattedCharSequence;FFI)Lnet/minecraft/client/gui/Font$PreparedText;", cancellable = true)
    private void prepare8xTextOutline__1090543675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090543675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bidirectionalShaping(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void bidirectionalShaping_1615927893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615927893L))
            info.setReturnValue("@ⴸ陾Rᤉ⚪/hWx3Y% I=p)3P3sAFg!)J:lR6{䗠UQf`S kW!Kgj");
    }

    @Inject(at = @At("HEAD"), method = "isBidirectional()Z", cancellable = true)
    private void isBidirectional_441464653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441464653L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "splitIgnoringLanguage(Lnet/minecraft/network/chat/FormattedText;I)Ljava/util/List;", cancellable = true)
    private void splitIgnoringLanguage__151101259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151101259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSplitter()Lnet/minecraft/client/StringSplitter;", cancellable = true)
    private void getSplitter_1987835954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987835954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plainSubstrByWidth(Ljava/lang/String;IZ)Ljava/lang/String;", cancellable = true)
    private void plainSubstrByWidth_201924164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(201924164L))
            info.setReturnValue("ؒt菻.7ু1{\"`foa@;J{zSKJ+(po_e`'q[}19G[C)ajPe)씫Yߵ @^6B;m(.驠 g/<t0x7{g5%B0:y,s3ᔽVV[th-");
    }

    @Inject(at = @At("HEAD"), method = "plainSubstrByWidth(Ljava/lang/String;I)Ljava/lang/String;", cancellable = true)
    private void plainSubstrByWidth__1237856432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237856432L))
            info.setReturnValue("鮀 FN $|`쪙ZCjLF$#=!1$_/e|JｄD)+鸐Ix㭝jK0ﾽ7ﺅZG^a2<?GaT+!$*AA,=NBG戇x$]{@왣4N4䳔C+s!]^?桘$3力Vu+驋");
    }

    @Inject(at = @At("HEAD"), method = "substrByWidth(Lnet/minecraft/network/chat/FormattedText;I)Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void substrByWidth_89745484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(89745484L))
            info.setReturnValue(null);
    }


}
