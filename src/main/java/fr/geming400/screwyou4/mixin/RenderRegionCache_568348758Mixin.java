package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.RenderRegionCache.class)
public class RenderRegionCache_568348758Mixin {
        @Inject(at = @At("HEAD"), method = "createRegion(Lnet/minecraft/client/multiplayer/ClientLevel;J)Lnet/minecraft/client/renderer/chunk/RenderSectionRegion;", cancellable = true)
    private void createRegion_695760867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695760867L))
            info.setReturnValue(null);
    }


}
