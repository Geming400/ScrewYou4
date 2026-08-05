package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.painting.Painting.class)
public class Painting_838989016Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_675896610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675896610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Ljava/util/Optional;", cancellable = true)
    private static void create__1107837364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107837364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant__1907102509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1907102509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1810228837(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1810228837L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket__349799675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-349799675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1362407675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362407675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_1219015999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1219015999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trackingPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void trackingPosition_1936718544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936718544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "snapTo(DDDFF)V", cancellable = true)
    private void snapTo__536688194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-536688194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropItem(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropItem__1811942414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1811942414L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playPlacementSound()V", cancellable = true)
    private void playPlacementSound_877263754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(877263754L))
            info.cancel();
    }


}
