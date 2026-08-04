package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CarvedPumpkinBlock.class)
public class CarvedPumpkinBlock_992778006Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1566335567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1566335567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpawnGolem(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void canSpawnGolem__110098380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-110098380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearPatternBlocks(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/pattern/BlockPattern$BlockPatternMatch;)V", cancellable = true)
    private static void clearPatternBlocks__1791066174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1791066174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePatternBlocks(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/pattern/BlockPattern$BlockPatternMatch;)V", cancellable = true)
    private static void updatePatternBlocks__1791066174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1791066174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceCopperBlockWithChest(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/pattern/BlockPattern$BlockPatternMatch;)V", cancellable = true)
    private void replaceCopperBlockWithChest__1791066422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1791066422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__265821762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265821762L))
            info.setReturnValue(null);
    }


}
