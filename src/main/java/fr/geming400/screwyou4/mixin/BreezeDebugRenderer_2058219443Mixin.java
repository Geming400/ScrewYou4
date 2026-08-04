package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.debug.BreezeDebugRenderer.class)
public class BreezeDebugRenderer_2058219443Mixin {
        @Inject(at = @At("HEAD"), method = "emitGizmos(DDDLnet/minecraft/util/debug/DebugValueAccess;Lnet/minecraft/client/renderer/culling/Frustum;F)V", cancellable = true)
    private void emitGizmos_957201495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(957201495L))
            info.cancel();
    }


}
