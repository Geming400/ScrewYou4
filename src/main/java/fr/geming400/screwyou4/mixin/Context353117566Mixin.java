package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EntityRendererProvider.Context.class)
public class Context353117566Mixin {
        @Inject(at = @At("HEAD"), method = "getBlockModelResolver()Lnet/minecraft/client/renderer/block/BlockModelResolver;", cancellable = true)
    private void getBlockModelResolver__1328411540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328411540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelSet()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private void getModelSet__1431326381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431326381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEquipmentRenderer()Lnet/minecraft/client/renderer/entity/layers/EquipmentLayerRenderer;", cancellable = true)
    private void getEquipmentRenderer_508068617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508068617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerSkinRenderCache()Lnet/minecraft/client/renderer/PlayerSkinRenderCache;", cancellable = true)
    private void getPlayerSkinRenderCache_1387800496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387800496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEquipmentAssets()Lnet/minecraft/client/resources/model/EquipmentAssetManager;", cancellable = true)
    private void getEquipmentAssets_1948296609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948296609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSprites()Lnet/minecraft/client/resources/model/sprite/SpriteGetter;", cancellable = true)
    private void getSprites_1398285394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398285394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAtlas(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/TextureAtlas;", cancellable = true)
    private void getAtlas__756638140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-756638140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bakeLayer(Lnet/minecraft/client/model/geom/ModelLayerLocation;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void bakeLayer__1985821864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985821864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFont()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void getFont_1619286479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619286479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceManager()Lnet/minecraft/server/packs/resources/ResourceManager;", cancellable = true)
    private void getResourceManager_1197963588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197963588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityRenderDispatcher()Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;", cancellable = true)
    private void getEntityRenderDispatcher__473743918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-473743918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapRenderer()Lnet/minecraft/client/renderer/MapRenderer;", cancellable = true)
    private void getMapRenderer_1323279679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323279679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemModelResolver()Lnet/minecraft/client/renderer/item/ItemModelResolver;", cancellable = true)
    private void getItemModelResolver__1497059600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497059600L))
            info.setReturnValue(null);
    }


}
