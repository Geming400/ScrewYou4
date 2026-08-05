package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider.Context.class)
public class Context_1676543207Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1232911831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1232911831L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_541083231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541083231L))
            info.setReturnValue(":/*z\u7C56SC6:-Nm{\u6DA9W\uA6C3^`-*cpnWv\u4927L\uA5A7B\u88E3}\u597An-Z\u79DB \"hmxB{*d`K\u652B3:\u1EBAu'a9Vj{#=bx+rG _!r,|2.4Xuz*FG9^zze'Q0AK^0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1714805948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714805948L))
            info.setReturnValue(1206700237);
    }

    @Inject(at = @At("HEAD"), method = "blockModelResolver()Lnet/minecraft/client/renderer/block/BlockModelResolver;", cancellable = true)
    private void blockModelResolver__4985900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-4985900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerSkinRenderCache()Lnet/minecraft/client/renderer/PlayerSkinRenderCache;", cancellable = true)
    private void playerSkinRenderCache__1583741160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583741160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemModelResolver()Lnet/minecraft/client/renderer/item/ItemModelResolver;", cancellable = true)
    private void itemModelResolver__173633960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173633960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "font()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void font__1352255177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1352255177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockEntityRenderDispatcher()Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderDispatcher;", cancellable = true)
    private void blockEntityRenderDispatcher_1129141016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129141016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprites()Lnet/minecraft/client/resources/model/sprite/SpriteGetter;", cancellable = true)
    private void sprites__1573256262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573256262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bakeLayer(Lnet/minecraft/client/model/geom/ModelLayerLocation;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void bakeLayer__662396224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662396224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityModelSet()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private void entityModelSet__107900741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107900741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityRenderer()Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;", cancellable = true)
    private void entityRenderer_849681722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849681722L))
            info.setReturnValue(null);
    }


}
