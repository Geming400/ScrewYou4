package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.geometry.BakedQuad.MaterialInfo.class)
public class MaterialInfo_360360757Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1745873015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745873015L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__775099219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-775099219L))
            info.setReturnValue("X5H /ZkMLU2h!U&+nE<.VK%\uFD4FXbOJXsF za\uC3AD?>\"");
    }

    @Inject(at = @At("HEAD"), method = "flags()I", cancellable = true)
    private void flags_398623002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398623002L))
            info.setReturnValue(-184907270);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_398623498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398623498L))
            info.setReturnValue(-388054689);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/client/resources/model/sprite/Material$Baked;Lcom/mojang/blaze3d/platform/Transparency;IZI)Lnet/minecraft/client/resources/model/geometry/BakedQuad$MaterialInfo;", cancellable = true)
    private static void of__501544629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501544629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layer()Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private void layer_1187261021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1187261021L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.ChunkSectionLayer.SOLID);
    }

    @Inject(at = @At("HEAD"), method = "lightEmission()I", cancellable = true)
    private void lightEmission_398623002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398623002L))
            info.setReturnValue(-184907270);
    }

    @Inject(at = @At("HEAD"), method = "isTinted()Z", cancellable = true)
    private void isTinted_398639339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398639339L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void sprite__1630645059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630645059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shade()Z", cancellable = true)
    private void shade_398639339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398639339L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tintIndex()I", cancellable = true)
    private void tintIndex_398623002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398623002L))
            info.setReturnValue(-184907270);
    }

    @Inject(at = @At("HEAD"), method = "itemRenderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void itemRenderType_1444940453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444940453L))
            info.setReturnValue(null);
    }


}
