package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.MissingTextureAtlasSprite.class)
public class MissingTextureAtlasSprite_1773795235Mixin {
        @Inject(at = @At("HEAD"), method = "getLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getLocation__669271071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669271071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/client/renderer/texture/SpriteContents;", cancellable = true)
    private static void create_1888805497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1888805497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateMissingImage()Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private static void generateMissingImage_2047578699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047578699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateMissingImage(II)Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private static void generateMissingImage__1494089365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494089365L))
            info.setReturnValue(null);
    }


}
