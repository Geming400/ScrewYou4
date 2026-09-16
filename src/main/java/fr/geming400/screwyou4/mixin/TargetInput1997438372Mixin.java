package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostPass.TargetInput.class)
public class TargetInput1997438372Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1088812104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088812104L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1527105399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527105399L))
            info.setReturnValue("\"\u750Dsi\u8FBB:7\u357AYC``z(n}#^zuc+\u2825q4$CgX7M^0\uCCB3.Gs+XLyTydzc<kauI\u2082&Rm\u6A4A1<:Na@>B.\u585BlK`\"`<O:&m*C=u7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1740176833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740176833L))
            info.setReturnValue(-1578454631);
    }

    @Inject(at = @At("HEAD"), method = "targetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void targetId_969809783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969809783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToPass(Lcom/mojang/blaze3d/framegraph/FramePass;Ljava/util/Map;)V", cancellable = true)
    private void addToPass_137555241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(137555241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bilinear()Z", cancellable = true)
    private void bilinear_1895433391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895433391L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "texture(Ljava/util/Map;)Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void texture_1332676668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1332676668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "depthBuffer()Z", cancellable = true)
    private void depthBuffer_794115160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794115160L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "samplerName()Ljava/lang/String;", cancellable = true)
    private void samplerName__1220522080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220522080L))
            info.setReturnValue("Tbf\u8044y2QAApd.vw`\u6A80&\u2C92iruP]M=X\u7F27Vc;g7OD\u350B\uF97B:bz>\u7690L6USN#E`:-2\";)\uBA973G4v\u758DpD\"6\u8BC8PSV_40J#@");
    }


}
