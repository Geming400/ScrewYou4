package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.GlyphRenderTypes.class)
public class GlyphRenderTypes_1331232369Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_422606100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422606100L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2101655893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101655893L))
            info.setReturnValue("(p;Ne>wq<FU7&/{6 Pjj5\u268Clu\uC738ai0|[h\u04CFsMW\uC498C\u2EF0QaT/fgjmTyh&2DywN6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1888584459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1888584459L))
            info.setReturnValue(-1109417659);
    }

    @Inject(at = @At("HEAD"), method = "normal()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void normal__542966054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-542966054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/client/gui/Font$DisplayMode;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void select__337207264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-337207264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seeThrough()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void seeThrough__648542417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648542417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForColorTexture(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/font/GlyphRenderTypes;", cancellable = true)
    private static void createForColorTexture__379297632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379297632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiPipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void guiPipeline_1113891649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113891649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "polygonOffset()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void polygonOffset_1511597076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511597076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForGrayscaleTexture(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/font/GlyphRenderTypes;", cancellable = true)
    private static void createForGrayscaleTexture__1692020676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692020676L))
            info.setReturnValue(null);
    }


}
