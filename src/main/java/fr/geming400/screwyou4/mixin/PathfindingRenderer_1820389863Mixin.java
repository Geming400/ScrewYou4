package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.debug.PathfindingRenderer.class)
public class PathfindingRenderer_1820389863Mixin {
        @Inject(at = @At("HEAD"), method = "emitGizmos(DDDLnet/minecraft/util/debug/DebugValueAccess;Lnet/minecraft/client/renderer/culling/Frustum;F)V", cancellable = true)
    private void emitGizmos__1175749345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1175749345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderPathLine(Lnet/minecraft/world/level/pathfinder/Path;DDD)V", cancellable = true)
    private static void renderPathLine__1336995124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1336995124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderPath(Lnet/minecraft/world/level/pathfinder/Path;FZZDDD)V", cancellable = true)
    private static void renderPath__340119852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-340119852L))
            info.cancel();
    }


}
