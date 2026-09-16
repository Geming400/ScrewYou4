package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.LeashFenceKnotEntity.class)
public class LeashFenceKnotEntity_1836989677Mixin {
        @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact_829739548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829739548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1503735580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503735580L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "notifyLeasheeRemoved(Lnet/minecraft/world/entity/Leashable;)V", cancellable = true)
    private void notifyLeasheeRemoved_448791142(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(448791142L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1891919012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1891919012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_1683448234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683448234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRopeHoldPosition(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRopeHoldPosition_239511275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(239511275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateKnot(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/decoration/LeashFenceKnotEntity;", cancellable = true)
    private static void getOrCreateKnot__1153064633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1153064633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "survives()Z", cancellable = true)
    private void survives_1433630594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1433630594L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "playPlacementSound()V", cancellable = true)
    private void playPlacementSound__1048180511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1048180511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createKnot(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/decoration/LeashFenceKnotEntity;", cancellable = true)
    private static void createKnot_830577230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830577230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKnot(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private static void getKnot_801919403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801919403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dropItem(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropItem__2027178327(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2027178327L))
            info.cancel();
    }


}
