package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.debug.BrainDebugRenderer.class)
public class BrainDebugRenderer_318066916Mixin {
        @Inject(at = @At("HEAD"), method = "emitGizmos(DDDLnet/minecraft/util/debug/DebugValueAccess;Lnet/minecraft/client/renderer/culling/Frustum;F)V", cancellable = true)
    private void emitGizmos__782951032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-782951032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGhostPois(Lnet/minecraft/util/debug/DebugValueAccess;)Ljava/util/Map;", cancellable = true)
    private void getGhostPois__1431743413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431743413L))
            info.setReturnValue(null);
    }


}
