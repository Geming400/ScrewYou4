package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DispenserBlock.class)
public class DispenserBlock1822419932Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1406102110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406102110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__646768548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-646768548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1963995317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963995317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerProjectileBehavior(Lnet/minecraft/world/level/ItemLike;)V", cancellable = true)
    private static void registerProjectileBehavior__647005934(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-647005934L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDispensePosition(Lnet/minecraft/core/dispenser/BlockSource;)Lnet/minecraft/core/Position;", cancellable = true)
    private static void getDispensePosition_1189422228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189422228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDispensePosition(Lnet/minecraft/core/dispenser/BlockSource;DLnet/minecraft/world/phys/Vec3;)Lnet/minecraft/core/Position;", cancellable = true)
    private static void getDispensePosition_1636593964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636593964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBehavior(Lnet/minecraft/world/level/ItemLike;Lnet/minecraft/core/dispenser/DispenseItemBehavior;)V", cancellable = true)
    private static void registerBehavior_2099673650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2099673650L))
            info.cancel();
    }


}
