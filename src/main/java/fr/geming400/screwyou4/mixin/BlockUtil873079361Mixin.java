package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.BlockUtil.class)
public class BlockUtil873079361Mixin {
        @Inject(at = @At("HEAD"), method = "getTopConnectedBlock(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/block/Block;)Ljava/util/Optional;", cancellable = true)
    private static void getTopConnectedBlock__1266814435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266814435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLargestRectangleAround(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction$Axis;ILnet/minecraft/core/Direction$Axis;ILjava/util/function/Predicate;)Lnet/minecraft/util/BlockUtil$FoundRectangle;", cancellable = true)
    private static void getLargestRectangleAround__210724925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-210724925L))
            info.setReturnValue(null);
    }


}
