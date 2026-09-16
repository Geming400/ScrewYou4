package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.debug.DebugRenderer.class)
public class DebugRenderer_1578353112Mixin {
        @Inject(at = @At("HEAD"), method = "getTargetedEntity(Lnet/minecraft/world/entity/Entity;I)Ljava/util/Optional;", cancellable = true)
    private static void getTargetedEntity_1931694118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931694118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refreshRendererList()V", cancellable = true)
    private void refreshRendererList__1739377778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1739377778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emitGizmos(Lnet/minecraft/client/renderer/culling/Frustum;DDDF)V", cancellable = true)
    private void emitGizmos_1421228040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1421228040L))
            info.cancel();
    }


}
