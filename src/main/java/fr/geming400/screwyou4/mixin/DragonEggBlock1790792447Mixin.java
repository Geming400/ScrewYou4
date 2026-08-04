package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DragonEggBlock.class)
public class DragonEggBlock1790792447Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__768321125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768321125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDustColor(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getDustColor__603225523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603225523L))
            info.setReturnValue(null);
    }


}
