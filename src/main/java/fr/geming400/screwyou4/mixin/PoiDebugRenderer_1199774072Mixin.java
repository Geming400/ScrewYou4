package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.debug.PoiDebugRenderer.class)
public class PoiDebugRenderer_1199774072Mixin {
        @Inject(at = @At("HEAD"), method = "emitGizmos(DDDLnet/minecraft/util/debug/DebugValueAccess;Lnet/minecraft/client/renderer/culling/Frustum;F)V", cancellable = true)
    private void emitGizmos_98756124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(98756124L))
            info.cancel();
    }


}
