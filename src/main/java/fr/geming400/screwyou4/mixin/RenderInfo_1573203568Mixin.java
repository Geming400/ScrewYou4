package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PlayerSkinRenderCache.RenderInfo.class)
public class RenderInfo_1573203568Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_664576803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(664576803L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2130555162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130555162L))
            info.setReturnValue(-2094553149);
    }

    @Inject(at = @At("HEAD"), method = "gameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void gameProfile__1524773666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524773666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void textureView__1673202691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1673202691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerSkin()Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private void playerSkin_108996330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108996330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glyphRenderTypes()Lnet/minecraft/client/gui/font/GlyphRenderTypes;", cancellable = true)
    private void glyphRenderTypes__1005925535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005925535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType_811848176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811848176L))
            info.setReturnValue(null);
    }


}
