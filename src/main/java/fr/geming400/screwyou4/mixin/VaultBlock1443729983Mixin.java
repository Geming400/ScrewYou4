package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.VaultBlock.class)
public class VaultBlock1443729983Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_1919208075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919208075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1115383589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1115383589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useItemOn(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/BlockHitResult;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItemOn__414762342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-414762342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror__1326312244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1326312244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__509737360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-509737360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_185130216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185130216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__141747672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141747672L))
            info.setReturnValue(null);
    }


}
