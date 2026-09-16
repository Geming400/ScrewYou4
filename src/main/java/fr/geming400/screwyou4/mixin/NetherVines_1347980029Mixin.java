package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NetherVines.class)
public class NetherVines_1347980029Mixin {
        @Inject(at = @At("HEAD"), method = "isValidGrowthState(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isValidGrowthState__1892796638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892796638L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBlocksToGrowWhenBonemealed(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private static void getBlocksToGrowWhenBonemealed__1712851548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1712851548L))
            info.setReturnValue(1887816202);
    }


}
