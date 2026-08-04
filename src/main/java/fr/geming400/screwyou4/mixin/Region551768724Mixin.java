package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.Stitcher.Region.class)
public class Region551768724Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__583691747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-583691747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/renderer/texture/Stitcher$Holder;)Z", cancellable = true)
    private void add__1280914656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1280914656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "walk(Lnet/minecraft/client/renderer/texture/Stitcher$SpriteLoader;I)V", cancellable = true)
    private void walk_1643445399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1643445399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_590030970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590030970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_590030970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590030970L))
            info.setReturnValue(null);
    }


}
