package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.Font.class)
public class Font_403186071Mixin {
        @Inject(at = @At("HEAD"), method = "split(Lnet/minecraft/network/chat/FormattedText;I)Ljava/util/List;", cancellable = true)
    private void split_1419266651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419266651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width(Ljava/lang/String;)I", cancellable = true)
    private void width__812955904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-812955904L))
            info.setReturnValue(-585005881);
    }

    @Inject(at = @At("HEAD"), method = "width(Lnet/minecraft/util/FormattedCharSequence;)I", cancellable = true)
    private void width_1612960939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612960939L))
            info.setReturnValue(-500723070);
    }

    @Inject(at = @At("HEAD"), method = "width(Lnet/minecraft/network/chat/FormattedText;)I", cancellable = true)
    private void width__1006059650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006059650L))
            info.setReturnValue(1646583016);
    }

    @Inject(at = @At("HEAD"), method = "bidirectionalShaping(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void bidirectionalShaping_676470960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676470960L))
            info.setReturnValue("nh\u1C1E7T<&|#_Fk`\u411EKk,zzCGyZ&\u4CF0./\u18465q\u680F^H:");
    }

    @Inject(at = @At("HEAD"), method = "prepare8xTextOutline(Lnet/minecraft/util/FormattedCharSequence;FFI)Lnet/minecraft/client/gui/Font$PreparedText;", cancellable = true)
    private void prepare8xTextOutline__1998148297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998148297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareText(Lnet/minecraft/util/FormattedCharSequence;FFIZZI)Lnet/minecraft/client/gui/Font$PreparedText;", cancellable = true)
    private void prepareText_901813512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901813512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareText(Ljava/lang/String;FFIZI)Lnet/minecraft/client/gui/Font$PreparedText;", cancellable = true)
    private void prepareText_1209468087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209468087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBidirectional()Z", cancellable = true)
    private void isBidirectional_1012570804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012570804L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "plainSubstrByWidth(Ljava/lang/String;IZ)Ljava/lang/String;", cancellable = true)
    private void plainSubstrByWidth_1390006808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390006808L))
            info.setReturnValue("Ts>)\u842CMiO]mh3'-r$n/ZSO$\"lOu7dm\u8A4C<LE^\u7DE8l_PQ\u3037c");
    }

    @Inject(at = @At("HEAD"), method = "plainSubstrByWidth(Ljava/lang/String;I)Ljava/lang/String;", cancellable = true)
    private void plainSubstrByWidth_324489468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(324489468L))
            info.setReturnValue(";\u7465=D%x\"*r\uB8043W\u4605\u93BB\u09E1wl\u8202,\u6A70=D<\uB73B+CtA82+&-^<cZ2D1yI?\u34A3smb*)x:\uFE836}+xTq'??\uFECD");
    }

    @Inject(at = @At("HEAD"), method = "getSplitter()Lnet/minecraft/client/StringSplitter;", cancellable = true)
    private void getSplitter__183284587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183284587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splitIgnoringLanguage(Lnet/minecraft/network/chat/FormattedText;I)Ljava/util/List;", cancellable = true)
    private void splitIgnoringLanguage_1155455700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155455700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wordWrapHeight(Lnet/minecraft/network/chat/FormattedText;I)I", cancellable = true)
    private void wordWrapHeight__365719256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-365719256L))
            info.setReturnValue(-935824427);
    }

    @Inject(at = @At("HEAD"), method = "substrByWidth(Lnet/minecraft/network/chat/FormattedText;I)Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void substrByWidth__1764945010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764945010L))
            info.setReturnValue(null);
    }


}
