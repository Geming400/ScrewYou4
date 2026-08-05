package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DoublePlantBlock.class)
public class DoublePlantBlock_390453353Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2126307076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126307076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyWaterloggedFrom(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void copyWaterloggedFrom_115091863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(115091863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__868146415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-868146415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy__331602809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331602809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy_2117885500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2117885500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void playerDestroy__1049289818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1049289818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeAt(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private static void placeAt__519145457(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-519145457L))
            info.cancel();
    }


}
