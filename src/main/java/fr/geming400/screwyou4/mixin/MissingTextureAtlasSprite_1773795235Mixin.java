package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.MissingTextureAtlasSprite.class)
public class MissingTextureAtlasSprite_1773795235Mixin {
        @Inject(at = @At("HEAD"), method = "getLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getLocation__1941188084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1941188084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/client/renderer/texture/SpriteContents;", cancellable = true)
    private static void create_984092789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984092789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateMissingImage()Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private static void generateMissingImage_815543521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815543521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateMissingImage(II)Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private static void generateMissingImage__68921727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68921727L))
            info.setReturnValue(null);
    }


}
