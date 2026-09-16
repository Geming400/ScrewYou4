package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DoublePlantBlock.class)
public class DoublePlantBlock_390453353Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1456898606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1456898606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy_1894448306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1894448306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void playerDestroy_716096941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(716096941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__2078735128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2078735128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_717515950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717515950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyWaterloggedFrom(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void copyWaterloggedFrom__1997868795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997868795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeAt(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private static void placeAt__265571799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-265571799L))
            info.cancel();
    }


}
