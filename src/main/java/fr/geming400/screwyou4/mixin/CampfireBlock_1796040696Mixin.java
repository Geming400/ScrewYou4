package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CampfireBlock.class)
public class CampfireBlock_1796040696Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1432481347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432481347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLitCampfire(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isLitCampfire__1929054991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929054991L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSmokeyPos(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isSmokeyPos__950705685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950705685L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "makeParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;ZZ)V", cancellable = true)
    private static void makeParticles_1615708392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1615708392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeLiquid(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void placeLiquid__25420006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-25420006L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1937616080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937616080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__673147785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673147785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick__2094245068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2094245068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__510783960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-510783960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canLight(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canLight_82755567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(82755567L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "dowse(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void dowse_2142853172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2142853172L))
            info.cancel();
    }


}
