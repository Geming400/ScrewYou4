package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.MipmapGenerator.class)
public class MipmapGenerator_1860185571Mixin {
        @Inject(at = @At("HEAD"), method = "generateMipLevels(Lnet/minecraft/resources/Identifier;[Lcom/mojang/blaze3d/platform/NativeImage;ILnet/minecraft/client/renderer/texture/MipmapStrategy;FLcom/mojang/blaze3d/platform/Transparency;)[Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private static void generateMipLevels_936346752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(936346752L))
            info.setReturnValue(null);
    }


}
