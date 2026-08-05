package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.TextColor.class)
public class TextColor613286488Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1998798251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998798251L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__522173983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522173983L))
            info.setReturnValue("%`+g^yj(m&o\uB27CV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_651548734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651548734L))
            info.setReturnValue(924387750);
    }

    @Inject(at = @At("HEAD"), method = "getValue()I", cancellable = true)
    private void getValue_651548734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651548734L))
            info.setReturnValue(924387750);
    }

    @Inject(at = @At("HEAD"), method = "serialize()Ljava/lang/String;", cancellable = true)
    private void serialize__522173983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522173983L))
            info.setReturnValue("%`+g^yj(m&o\uB27CV");
    }

    @Inject(at = @At("HEAD"), method = "fromRgb(I)Lnet/minecraft/network/chat/TextColor;", cancellable = true)
    private static void fromRgb_1364878129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364878129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromLegacyFormat(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/TextColor;", cancellable = true)
    private static void fromLegacyFormat_597238796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597238796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatValue()Ljava/lang/String;", cancellable = true)
    private void formatValue__522173487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522173487L))
            info.setReturnValue("r}K2d\u6FEBQz=LuI6b\u1E79|0eyKZ&j\u6B2B\u68EE\u13F8\u9929!Tm%dF*1s\u080F*\"\u21C0_dbwb6Pe(%\uA2D5ku]s18\u0354Oa Y-0\u58A6]\u78FD");
    }

    @Inject(at = @At("HEAD"), method = "parseColor(Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void parseColor_552261193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552261193L))
            info.setReturnValue(null);
    }


}
