package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.FluidRenderer.class)
public class FluidRenderer917589023Mixin {
        @Inject(at = @At("HEAD"), method = "shouldRenderFace(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private static void shouldRenderFace_1394166541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394166541L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tesselate(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/client/renderer/block/FluidRenderer$Output;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)V", cancellable = true)
    private void tesselate_2084906593(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2084906593L))
            info.cancel();
    }


}
