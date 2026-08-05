package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.FluidRenderer.class)
public class FluidRenderer917589023Mixin {
        @Inject(at = @At("HEAD"), method = "shouldRenderFace(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private static void shouldRenderFace__641867789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641867789L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tesselate(Lnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/client/renderer/block/FluidRenderer$Output;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)V", cancellable = true)
    private void tesselate__2121232197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2121232197L))
            info.cancel();
    }


}
