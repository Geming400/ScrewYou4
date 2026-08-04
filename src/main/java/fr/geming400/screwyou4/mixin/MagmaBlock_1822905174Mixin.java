package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MagmaBlock.class)
public class MagmaBlock_1822905174Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__736208399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-736208399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void stepOn_1137706797(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1137706797L))
            info.cancel();
    }


}
