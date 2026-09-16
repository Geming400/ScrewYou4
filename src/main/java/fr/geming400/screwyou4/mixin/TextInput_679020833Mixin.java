package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.input.TextInput.class)
public class TextInput_679020833Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__229605436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229605436L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1449444357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449444357L))
            info.setReturnValue("1\u3D34h;-{)Iv\"\u2490B9$Q2tM\u31A3\u4838 cn\"'K2qZF?GpX\u4F99w6t:\uA998f3\u1215,E1K`ex6 ?#|W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1236372923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236372923L))
            info.setReturnValue(-784141731);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__961127168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961127168L))
            info.setReturnValue(-1698773779);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label_1291294631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291294631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxLength()I", cancellable = true)
    private void maxLength_281346012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281346012L))
            info.setReturnValue(-1384673601);
    }

    @Inject(at = @At("HEAD"), method = "multiline()Ljava/util/Optional;", cancellable = true)
    private void multiline_689489019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689489019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initial()Ljava/lang/String;", cancellable = true)
    private void initial__1435626259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435626259L))
            info.setReturnValue(" \"\uA35B\uAD2DU8b-\uC19A\u2E0C[QY\u7063Tkx}W\u8C78wHqcPnij,c$K?5`\u0E82aH.mm)\"U2ahd!Cdf-y\u7907`d1Cvy`mD[\uA214`^n%#");
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec__64974238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64974238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "labelVisible()Z", cancellable = true)
    private void labelVisible__1028805959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028805959L))
            info.setReturnValue(true);
    }


}
