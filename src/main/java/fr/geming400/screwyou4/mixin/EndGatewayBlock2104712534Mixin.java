package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.EndGatewayBlock.class)
public class EndGatewayBlock2104712534Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__454401038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454401038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_519234879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519234879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker_151245191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151245191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPortalDestination(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void getPortalDestination__1353931105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1353931105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1982110453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1982110453L))
            info.cancel();
    }


}
