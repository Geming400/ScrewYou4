package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.NoiseColumn.class)
public class NoiseColumn122769970Mixin {
        @Inject(at = @At("HEAD"), method = "getBlock(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlock_139355664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139355664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlock(ILnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlock__1680642920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1680642920L))
            info.cancel();
    }


}
