package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MagmaBlock.class)
public class MagmaBlock_1822905174Mixin {
        @Inject(at = @At("HEAD"), method = "stepOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void stepOn_1627255800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1627255800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1405616869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1405616869L))
            info.setReturnValue(null);
    }


}
