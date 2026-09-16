package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.painting.Painting.class)
public class Painting_838989016Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1789271048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789271048L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Ljava/util/Optional;", cancellable = true)
    private static void create__1572980408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572980408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant__1627138396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1627138396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1545723363(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1545723363L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackingPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void trackingPosition_463431120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463431120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_685447573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(685447573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket_1850649732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1850649732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_893918351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(893918351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "snapTo(DDDFF)V", cancellable = true)
    private void snapTo__727638173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-727638173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropItem(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropItem_1269788308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1269788308L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playPlacementSound()V", cancellable = true)
    private void playPlacementSound__2046181172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2046181172L))
            info.cancel();
    }


}
