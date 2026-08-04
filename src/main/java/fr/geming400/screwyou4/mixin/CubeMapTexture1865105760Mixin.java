package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.CubeMapTexture.class)
public class CubeMapTexture1865105760Mixin {
        @Inject(at = @At("HEAD"), method = "loadContents(Lnet/minecraft/server/packs/resources/ResourceManager;)Lnet/minecraft/client/renderer/texture/TextureContents;", cancellable = true)
    private void loadContents_230965126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(230965126L))
            info.setReturnValue(null);
    }


}
