package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DragonEggBlock.class)
public class DragonEggBlock1790792447Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1437729595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437729595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDustColor(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getDustColor__61810606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-61810606L))
            info.setReturnValue(1118371759);
    }


}
