package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.RenderType.class)
public class RenderType_1927332982Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1597211286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597211286L))
            info.setReturnValue("usm*,v\u2BF9aC_i\u9BFC@{\u7598\u2281h?!OsH=/\"_R4g\uABBAuJ0/wUjc|\u894D>");
    }

    @Inject(at = @At("HEAD"), method = "format()Lcom/mojang/blaze3d/vertex/VertexFormat;", cancellable = true)
    private void format_1880098879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1880098879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Lnet/minecraft/client/renderer/rendertype/RenderSetup;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private static void create_1388826071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1388826071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepare()Lnet/minecraft/client/renderer/rendertype/PreparedRenderType;", cancellable = true)
    private void prepare_922988162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922988162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "affectsCrumbling()Z", cancellable = true)
    private void affectsCrumbling_509744121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509744121L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasBlending()Z", cancellable = true)
    private void hasBlending__25573791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-25573791L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "primitiveTopology()Lcom/mojang/blaze3d/PrimitiveTopology;", cancellable = true)
    private void primitiveTopology_148756174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(148756174L))
            info.setReturnValue(com.mojang.blaze3d.PrimitiveTopology.DEBUG_LINE_STRIP);
    }

    @Inject(at = @At("HEAD"), method = "canConsolidateConsecutiveGeometry()Z", cancellable = true)
    private void canConsolidateConsecutiveGeometry__570196951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-570196951L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sortOnUpload()Z", cancellable = true)
    private void sortOnUpload_1646442606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646442606L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline_25043179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(25043179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outline()Ljava/util/Optional;", cancellable = true)
    private void outline__1502734235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502734235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOutline()Z", cancellable = true)
    private void isOutline__350446220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350446220L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "outputTarget()Lnet/minecraft/client/renderer/rendertype/OutputTarget;", cancellable = true)
    private void outputTarget__1435723406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435723406L))
            info.setReturnValue(null);
    }


}
