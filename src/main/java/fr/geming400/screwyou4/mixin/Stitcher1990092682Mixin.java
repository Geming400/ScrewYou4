package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.Stitcher.class)
public class Stitcher1990092682Mixin {
        @Inject(at = @At("HEAD"), method = "stitch()V", cancellable = true)
    private void stitch_361022508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(361022508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_52196192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52196192L))
            info.setReturnValue(-1514410171);
    }

    @Inject(at = @At("HEAD"), method = "gatherSprites(Lnet/minecraft/client/renderer/texture/Stitcher$SpriteLoader;)V", cancellable = true)
    private void gatherSprites_481403801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(481403801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerSprite(Lnet/minecraft/client/renderer/texture/Stitcher$Entry;)V", cancellable = true)
    private void registerSprite__1656108248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1656108248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_264475507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264475507L))
            info.setReturnValue(-1092924411);
    }


}
