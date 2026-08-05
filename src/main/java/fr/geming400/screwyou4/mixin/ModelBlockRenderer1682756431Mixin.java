package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.ModelBlockRenderer.class)
public class ModelBlockRenderer1682756431Mixin {
        @Inject(at = @At("HEAD"), method = "forceOpaque(ZLnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void forceOpaque__1634107721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634107721L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tesselateBlock(Lnet/minecraft/client/renderer/block/BlockQuadOutput;FFFLnet/minecraft/client/renderer/block/BlockAndTintGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;J)V", cancellable = true)
    private void tesselateBlock__1262877105(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1262877105L))
            info.cancel();
    }


}
