package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider.Context.class)
public class Context_1676543207Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_767916938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767916938L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1848000565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848000565L))
            info.setReturnValue("D|ovW_w!g\u2E33O)p3A@PE.tm!*cN\u26DDF\u4099@\uC737Ea*W1Hx\u4D553`I=g.\u86B95`XOi\u59B8\u3CF4Gtl_e54&>) R&Aa9-V[2FeD\u29C7En&[n|*>*1dq(ZYzP3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2061071999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061071999L))
            info.setReturnValue(1339745123);
    }

    @Inject(at = @At("HEAD"), method = "bakeLayer(Lnet/minecraft/client/model/geom/ModelLayerLocation;)Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void bakeLayer__1610309432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610309432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "font()Lnet/minecraft/client/gui/Font;", cancellable = true)
    private void font_391975560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(391975560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockEntityRenderDispatcher()Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderDispatcher;", cancellable = true)
    private void blockEntityRenderDispatcher_880261419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880261419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerSkinRenderCache()Lnet/minecraft/client/renderer/PlayerSkinRenderCache;", cancellable = true)
    private void playerSkinRenderCache__208539094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-208539094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemModelResolver()Lnet/minecraft/client/renderer/item/ItemModelResolver;", cancellable = true)
    private void itemModelResolver_816728404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816728404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockModelResolver()Lnet/minecraft/client/renderer/block/BlockModelResolver;", cancellable = true)
    private void blockModelResolver_1173579670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173579670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprites()Lnet/minecraft/client/resources/model/sprite/SpriteGetter;", cancellable = true)
    private void sprites_1680156040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680156040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityModelSet()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private void entityModelSet__520172489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-520172489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityRenderer()Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;", cancellable = true)
    private void entityRenderer_1708084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1708084L))
            info.setReturnValue(null);
    }


}
