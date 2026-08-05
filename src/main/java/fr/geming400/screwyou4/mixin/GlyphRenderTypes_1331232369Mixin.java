package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.GlyphRenderTypes.class)
public class GlyphRenderTypes_1331232369Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1578222669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578222669L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_195772393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(195772393L))
            info.setReturnValue("@=_\".篦Nh o妁?+&製c+w>:.Un=#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1369495110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369495110L))
            info.setReturnValue(542499315);
    }

    @Inject(at = @At("HEAD"), method = "normal()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void normal__1879155231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879155231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/client/gui/Font$DisplayMode;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void select_2062752036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2062752036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForColorTexture(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/font/GlyphRenderTypes;", cancellable = true)
    private static void createForColorTexture_888362139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888362139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seeThrough()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void seeThrough__1879155231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879155231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiPipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void guiPipeline__1966326716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966326716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "polygonOffset()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void polygonOffset__1879155231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879155231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForGrayscaleTexture(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/font/GlyphRenderTypes;", cancellable = true)
    private static void createForGrayscaleTexture_888362139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888362139L))
            info.setReturnValue(null);
    }


}
