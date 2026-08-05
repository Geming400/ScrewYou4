package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.SpeleothemUtils.class)
public class SpeleothemUtils_1390926119Mixin {
        @Inject(at = @At("HEAD"), method = "isEmptyOrWater(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isEmptyOrWater_1245637380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245637380L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNeitherEmptyNorWater(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isNeitherEmptyNorWater_1245637380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245637380L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBaseOrLava(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/HolderSet;)Z", cancellable = true)
    private static void isBaseOrLava_1264507427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264507427L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBase(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/HolderSet;)Z", cancellable = true)
    private static void isBase_1264507427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264507427L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEmptyOrWaterOrLava(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isEmptyOrWaterOrLava_1245637380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245637380L))
            info.setReturnValue(true);
    }


}
