package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.RenderType.class)
public class RenderType_1927332982Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_791872510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791872510L))
            info.setReturnValue("uShѥ*\")7B6^h틺vh!@|HR,");
    }

    @Inject(at = @At("HEAD"), method = "format()Lcom/mojang/blaze3d/vertex/VertexFormat;", cancellable = true)
    private void format_1097524936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097524936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Lnet/minecraft/client/renderer/rendertype/RenderSetup;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void create__1931112621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1931112621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepare()Lnet/minecraft/client/renderer/rendertype/PreparedRenderType;", cancellable = true)
    private void prepare_34824873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34824873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canConsolidateConsecutiveGeometry()Z", cancellable = true)
    private void canConsolidateConsecutiveGeometry_1965611564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965611564L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sortOnUpload()Z", cancellable = true)
    private void sortOnUpload_1965611564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965611564L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "outputTarget()Lnet/minecraft/client/renderer/rendertype/OutputTarget;", cancellable = true)
    private void outputTarget_186968740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186968740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "affectsCrumbling()Z", cancellable = true)
    private void affectsCrumbling_1965611564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965611564L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "primitiveTopology()Lcom/mojang/blaze3d/PrimitiveTopology;", cancellable = true)
    private void primitiveTopology_686583256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686583256L))
            info.setReturnValue(com.mojang.blaze3d.PrimitiveTopology.DEBUG_LINE_STRIP);
    }

    @Inject(at = @At("HEAD"), method = "hasBlending()Z", cancellable = true)
    private void hasBlending_1965611564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965611564L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOutline()Z", cancellable = true)
    private void isOutline_1965611564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965611564L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "outline()Ljava/util/Optional;", cancellable = true)
    private void outline__2122172893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122172893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__1370226103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370226103L))
            info.setReturnValue(null);
    }


}
