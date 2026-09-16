package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.geometry.BakedQuad.MaterialInfo.class)
public class MaterialInfo_360360757Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__548265512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-548265512L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1130784281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130784281L))
            info.setReturnValue("-^H\u0771B4EMQInmp/f7Ri6?fH,oc(<8uM}v");
    }

    @Inject(at = @At("HEAD"), method = "flags()I", cancellable = true)
    private void flags_1662357235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662357235L))
            info.setReturnValue(-958728689);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_917712847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917712847L))
            info.setReturnValue(-1331960192);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/client/resources/model/sprite/Material$Baked;Lcom/mojang/blaze3d/platform/Transparency;IZI)Lnet/minecraft/client/resources/model/geometry/BakedQuad$MaterialInfo;", cancellable = true)
    private static void of__1270484460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270484460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layer()Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private void layer_816746092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816746092L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.ChunkSectionLayer.SOLID);
    }

    @Inject(at = @At("HEAD"), method = "lightEmission()I", cancellable = true)
    private void lightEmission__156363139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156363139L))
            info.setReturnValue(-1109262298);
    }

    @Inject(at = @At("HEAD"), method = "itemRenderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void itemRenderType_847525538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847525538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shade()Z", cancellable = true)
    private void shade__1020770594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1020770594L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tintIndex()I", cancellable = true)
    private void tintIndex__1478558493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1478558493L))
            info.setReturnValue(-561658288);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void sprite__1859871550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859871550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTinted()Z", cancellable = true)
    private void isTinted__1100887865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1100887865L))
            info.setReturnValue(false);
    }


}
