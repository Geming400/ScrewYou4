package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PlayerSkinRenderCache.RenderInfo.class)
public class RenderInfo_1573203568Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1336251966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336251966L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1611465813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611465813L))
            info.setReturnValue(-2104348425);
    }

    @Inject(at = @At("HEAD"), method = "gameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void gameProfile_2090371847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2090371847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType__1637184032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637184032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void textureView__827411043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827411043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glyphRenderTypes()Lnet/minecraft/client/gui/font/GlyphRenderTypes;", cancellable = true)
    private void glyphRenderTypes__2043043542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043043542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerSkin()Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private void playerSkin__79116692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-79116692L))
            info.setReturnValue(null);
    }


}
