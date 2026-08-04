package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartCommandBlock.class)
public class MinecartCommandBlock_969975137Mixin {
        @Inject(at = @At("HEAD"), method = "getCommandBlock()Lnet/minecraft/world/level/BaseCommandBlock;", cancellable = true)
    private void getCommandBlock_76608959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76608959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1493393796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1493393796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1679242716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1679242716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__1332926458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332926458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activateMinecart(Lnet/minecraft/server/level/ServerLevel;IIIZ)V", cancellable = true)
    private void activateMinecart_598238005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(598238005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState__1325783730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325783730L))
            info.setReturnValue(null);
    }


}
