package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.SimpleTexture.class)
public class SimpleTexture_497351365Mixin {
        @Inject(at = @At("HEAD"), method = "loadContents(Lnet/minecraft/server/packs/resources/ResourceManager;)Lnet/minecraft/client/renderer/texture/TextureContents;", cancellable = true)
    private void loadContents__1136789270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136789270L))
            info.setReturnValue(null);
    }


}
