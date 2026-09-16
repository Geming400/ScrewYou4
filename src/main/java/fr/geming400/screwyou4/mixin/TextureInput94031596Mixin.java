package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostPass.TextureInput.class)
public class TextureInput94031596Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__814594672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-814594672L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_864455121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(864455121L))
            info.setReturnValue("O\uB6E7_x.\u60A1).2IjFX}Y\u92B8W1\"\u824Cbj,\uD6E5On7Dm\u1ACCU]G,?dQws\u30D8nvn\uFBDCC]\u53D6npjh8V2\uFBA5cv\u5A1AxkG,08\uCAD9nw/\"'\uAD05kJ\u0C78I\u89B4\u103A'\u7E5D%gbL%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_651383687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651383687L))
            info.setReturnValue(409878480);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__1546116404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546116404L))
            info.setReturnValue(557730324);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__991316981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-991316981L))
            info.setReturnValue(-133958181);
    }

    @Inject(at = @At("HEAD"), method = "samplerName()Ljava/lang/String;", cancellable = true)
    private void samplerName_1171038440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171038440L))
            info.setReturnValue("f_");
    }

    @Inject(at = @At("HEAD"), method = "bilinear()Z", cancellable = true)
    private void bilinear__7973385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-7973385L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addToPass(Lcom/mojang/blaze3d/framegraph/FramePass;Ljava/util/Map;)V", cancellable = true)
    private void addToPass__1765851535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1765851535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/client/renderer/texture/AbstractTexture;", cancellable = true)
    private void texture__1077589748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1077589748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture(Ljava/util/Map;)Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void texture__570730108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-570730108L))
            info.setReturnValue(null);
    }


}
