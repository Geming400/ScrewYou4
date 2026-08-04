package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.FluidStateModelSet.class)
public class FluidStateModelSet537124808Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/material/FluidState;)Lnet/minecraft/client/renderer/block/FluidModel;", cancellable = true)
    private void get__1374882283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1374882283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/sprite/MaterialBaker;)Ljava/util/Map;", cancellable = true)
    private static void bake_1917188983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917188983L))
            info.setReturnValue(null);
    }


}
