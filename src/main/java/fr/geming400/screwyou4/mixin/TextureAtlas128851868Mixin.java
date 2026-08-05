package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.TextureAtlas.class)
public class TextureAtlas128851868Mixin {
        @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location_1980752611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980752611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_167126607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(167126607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_167126607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(167126607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearTextureData()V", cancellable = true)
    private void clearTextureData_167126607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(167126607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cycleAnimationFrames()V", cancellable = true)
    private void cycleAnimationFrames_167126607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(167126607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "maxSupportedTextureSize()I", cancellable = true)
    private void maxSupportedTextureSize_167114114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167114114L))
            info.setReturnValue(-915734514);
    }

    @Inject(at = @At("HEAD"), method = "upload(Lnet/minecraft/client/renderer/texture/SpriteLoader$Preparations;)V", cancellable = true)
    private void upload__1376850130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1376850130L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSprite(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void getSprite__1796672099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796672099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingSprite()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void missingSprite__1862153947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1862153947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpContents(Lnet/minecraft/resources/Identifier;Ljava/nio/file/Path;)V", cancellable = true)
    private void dumpContents_956065846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(956065846L))
            info.cancel();
    }


}
