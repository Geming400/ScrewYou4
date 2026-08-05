package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.MapRenderer.class)
public class MapRenderer336008401Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;Lnet/minecraft/client/renderer/state/MapRenderState;)V", cancellable = true)
    private void extractRenderState__906959941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-906959941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/client/renderer/state/MapRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ZI)V", cancellable = true)
    private void render__2046974743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2046974743L))
            info.cancel();
    }


}
