package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.TextureAtlas.class)
public class TextureAtlas128851868Mixin {
        @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location_340978072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340978072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1985723561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1985723561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__831790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-831790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dumpContents(Lnet/minecraft/resources/Identifier;Ljava/nio/file/Path;)V", cancellable = true)
    private void dumpContents__1752116792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1752116792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "missingSprite()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void missingSprite_1982182320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982182320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upload(Lnet/minecraft/client/renderer/texture/SpriteLoader$Preparations;)V", cancellable = true)
    private void upload_267137135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(267137135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSprite(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void getSprite__1817013096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817013096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxSupportedTextureSize()I", cancellable = true)
    private void maxSupportedTextureSize__1945921776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945921776L))
            info.setReturnValue(1651486857);
    }

    @Inject(at = @At("HEAD"), method = "clearTextureData()V", cancellable = true)
    private void clearTextureData_648350327(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(648350327L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cycleAnimationFrames()V", cancellable = true)
    private void cycleAnimationFrames__290133685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-290133685L))
            info.cancel();
    }


}
