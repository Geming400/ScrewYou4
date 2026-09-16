package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EntityRendererProvider.Context.class)
public class Context353117566Mixin {
        @Inject(at = @At("HEAD"), method = "getFont()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void getFont__1764309270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764309270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerSkinRenderCache()Lnet/minecraft/client/renderer/PlayerSkinRenderCache;", cancellable = true)
    private void getPlayerSkinRenderCache__1528483912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528483912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelSet()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private void getModelSet__972213822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-972213822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEquipmentRenderer()Lnet/minecraft/client/renderer/entity/layers/EquipmentLayerRenderer;", cancellable = true)
    private void getEquipmentRenderer__1207442492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207442492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockModelResolver()Lnet/minecraft/client/renderer/block/BlockModelResolver;", cancellable = true)
    private void getBlockModelResolver__146365148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-146365148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEquipmentAssets()Lnet/minecraft/client/resources/model/EquipmentAssetManager;", cancellable = true)
    private void getEquipmentAssets__17595876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-17595876L))
            info.setReturnValue(new net.minecraft.client.resources.model.EquipmentAssetManager());
    }

    @Inject(at = @At("HEAD"), method = "getEntityRenderDispatcher()Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;", cancellable = true)
    private void getEntityRenderDispatcher_870808252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870808252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemModelResolver()Lnet/minecraft/client/renderer/item/ItemModelResolver;", cancellable = true)
    private void getItemModelResolver__1081646922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081646922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapRenderer()Lnet/minecraft/client/renderer/MapRenderer;", cancellable = true)
    private void getMapRenderer_1625571606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625571606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAtlas(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/TextureAtlas;", cancellable = true)
    private void getAtlas_775061401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(775061401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSprites()Lnet/minecraft/client/resources/model/sprite/SpriteGetter;", cancellable = true)
    private void getSprites__1123443606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123443606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bakeLayer(Lnet/minecraft/client/model/geom/ModelLayerLocation;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void bakeLayer_1361232224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1361232224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceManager()Lnet/minecraft/server/packs/resources/ResourceManager;", cancellable = true)
    private void getResourceManager__551520883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551520883L))
            info.setReturnValue(null);
    }


}
