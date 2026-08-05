package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.Stitcher.class)
public class Stitcher1990092682Mixin {
        @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_2028354928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028354928L))
            info.setReturnValue(106753991);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_2028354928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028354928L))
            info.setReturnValue(106753991);
    }

    @Inject(at = @At("HEAD"), method = "registerSprite(Lnet/minecraft/client/renderer/texture/Stitcher$Entry;)V", cancellable = true)
    private void registerSprite__233418896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-233418896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gatherSprites(Lnet/minecraft/client/renderer/texture/Stitcher$SpriteLoader;)V", cancellable = true)
    private void gatherSprites__1854901114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1854901114L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stitch()V", cancellable = true)
    private void stitch_2028367421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2028367421L))
            info.cancel();
    }


}
