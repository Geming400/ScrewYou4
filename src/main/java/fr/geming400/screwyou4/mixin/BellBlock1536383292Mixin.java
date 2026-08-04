package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BellBlock.class)
public class BellBlock1536383292Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_2011861384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011861384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1022730280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022730280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror__1233658935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1233658935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__49094363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-49094363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onHit(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/phys/BlockHitResult;Lnet/minecraft/world/entity/player/Player;Z)Z", cancellable = true)
    private void onHit_23649560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23649560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_277783525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277783525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__417084051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417084051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attemptToRing(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void attemptToRing__654999331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654999331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attemptToRing(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void attemptToRing__889494396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889494396L))
            info.setReturnValue(null);
    }


}
