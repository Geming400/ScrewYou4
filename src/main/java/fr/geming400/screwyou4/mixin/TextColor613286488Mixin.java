package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.TextColor.class)
public class TextColor613286488Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__295340276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295340276L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1383709517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383709517L))
            info.setReturnValue("\"E{xFTY.<\uAC05pe\u152B^6L6yfuxJOk$V94v1\"rzkf|l]\u8B0C(8up\u48BEX|TbR6Hk\uD1F5BaJ(ks\u0EA0U\u7E0BdW7O\u92C6+|&}\u35F73\"yFpU,p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1170638083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170638083L))
            info.setReturnValue(-125061075);
    }

    @Inject(at = @At("HEAD"), method = "getValue()I", cancellable = true)
    private void getValue__1989132957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989132957L))
            info.setReturnValue(678548451);
    }

    @Inject(at = @At("HEAD"), method = "formatValue()Ljava/lang/String;", cancellable = true)
    private void formatValue__1675073525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1675073525L))
            info.setReturnValue("L`5O");
    }

    @Inject(at = @At("HEAD"), method = "serialize()Ljava/lang/String;", cancellable = true)
    private void serialize__899202879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-899202879L))
            info.setReturnValue("!xE\u3F06rt@N[eT\u7A46QY#(cB");
    }

    @Inject(at = @At("HEAD"), method = "fromRgb(I)Lnet/minecraft/network/chat/TextColor;", cancellable = true)
    private static void fromRgb__1215195506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1215195506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromLegacyFormat(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/TextColor;", cancellable = true)
    private static void fromLegacyFormat_1689166838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689166838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseColor(Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void parseColor__168135719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168135719L))
            info.setReturnValue(null);
    }


}
