package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.SpeleothemUtils.class)
public class SpeleothemUtils_1390926119Mixin {
        @Inject(at = @At("HEAD"), method = "isBase(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/HolderSet;)Z", cancellable = true)
    private static void isBase__450440514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450440514L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isEmptyOrWater(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isEmptyOrWater__1024997709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1024997709L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBaseOrLava(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/HolderSet;)Z", cancellable = true)
    private static void isBaseOrLava_1864307585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864307585L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNeitherEmptyNorWater(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isNeitherEmptyNorWater__1608297926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1608297926L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEmptyOrWaterOrLava(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isEmptyOrWaterOrLava_513226896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513226896L))
            info.setReturnValue(false);
    }


}
