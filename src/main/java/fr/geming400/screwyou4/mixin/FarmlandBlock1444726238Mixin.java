package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FarmlandBlock.class)
public class FarmlandBlock1444726238Mixin {
        @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__603507320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-603507320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1783795804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783795804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "turnToDirt(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void turnToDirt__931464939(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-931464939L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1024462242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1024462242L))
            info.setReturnValue(null);
    }


}
