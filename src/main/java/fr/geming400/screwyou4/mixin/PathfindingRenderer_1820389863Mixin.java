package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.debug.PathfindingRenderer.class)
public class PathfindingRenderer_1820389863Mixin {
        @Inject(at = @At("HEAD"), method = "renderPath(Lnet/minecraft/world/level/pathfinder/Path;FZZDDD)V", cancellable = true)
    private static void renderPath__1784847815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1784847815L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emitGizmos(DDDLnet/minecraft/util/debug/DebugValueAccess;Lnet/minecraft/client/renderer/culling/Frustum;F)V", cancellable = true)
    private void emitGizmos_719371915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(719371915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderPathLine(Lnet/minecraft/world/level/pathfinder/Path;DDD)V", cancellable = true)
    private static void renderPathLine__2099978085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2099978085L))
            info.cancel();
    }


}
