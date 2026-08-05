package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DispenserBlock.class)
public class DispenserBlock1822419932Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__736693640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-736693640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_236942277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236942277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_563820165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(563820165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerProjectileBehavior(Lnet/minecraft/world/level/ItemLike;)V", cancellable = true)
    private static void registerProjectileBehavior__1124882768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1124882768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDispensePosition(Lnet/minecraft/core/dispenser/BlockSource;DLnet/minecraft/world/phys/Vec3;)Lnet/minecraft/core/Position;", cancellable = true)
    private static void getDispensePosition__384605240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-384605240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDispensePosition(Lnet/minecraft/core/dispenser/BlockSource;)Lnet/minecraft/core/Position;", cancellable = true)
    private static void getDispensePosition__386037968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386037968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBehavior(Lnet/minecraft/world/level/ItemLike;Lnet/minecraft/core/dispenser/DispenseItemBehavior;)V", cancellable = true)
    private static void registerBehavior__69406307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-69406307L))
            info.cancel();
    }


}
