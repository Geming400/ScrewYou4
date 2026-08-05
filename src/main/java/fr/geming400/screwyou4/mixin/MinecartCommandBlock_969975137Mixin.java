package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartCommandBlock.class)
public class MinecartCommandBlock_969975137Mixin {
        @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1676709484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1676709484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1024904472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1024904472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__37274992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37274992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activateMinecart(Lnet/minecraft/server/level/ServerLevel;IIIZ)V", cancellable = true)
    private void activateMinecart_1986786287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1986786287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState__1736641879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736641879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCommandBlock()Lnet/minecraft/world/level/BaseCommandBlock;", cancellable = true)
    private void getCommandBlock__2020768713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020768713L))
            info.setReturnValue(null);
    }


}
