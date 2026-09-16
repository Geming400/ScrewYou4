package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CarvedPumpkinBlock.class)
public class CarvedPumpkinBlock_992778006Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2059223259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059223259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1476410475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476410475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceCopperBlockWithChest(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/pattern/BlockPattern$BlockPatternMatch;)V", cancellable = true)
    private void replaceCopperBlockWithChest_1502567781(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1502567781L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearPatternBlocks(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/pattern/BlockPattern$BlockPatternMatch;)V", cancellable = true)
    private static void clearPatternBlocks__471376597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-471376597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePatternBlocks(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/pattern/BlockPattern$BlockPatternMatch;)V", cancellable = true)
    private static void updatePatternBlocks_1275652655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1275652655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSpawnGolem(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void canSpawnGolem_1611700211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611700211L))
            info.setReturnValue(false);
    }


}
