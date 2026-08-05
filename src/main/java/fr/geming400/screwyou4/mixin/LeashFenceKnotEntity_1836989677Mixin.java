package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.LeashFenceKnotEntity.class)
public class LeashFenceKnotEntity_1836989677Mixin {
        @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__465911918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-465911918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1248674409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248674409L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket__2077950636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2077950636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notifyLeasheeRemoved(Lnet/minecraft/world/entity/Leashable;)V", cancellable = true)
    private void notifyLeasheeRemoved_1762208626(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1762208626L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRopeHoldPosition(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRopeHoldPosition__432829861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432829861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult__1934558960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934558960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "survives()Z", cancellable = true)
    private void survives_1875268259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875268259L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "dropItem(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropItem__813941753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-813941753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateKnot(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/decoration/LeashFenceKnotEntity;", cancellable = true)
    private static void getOrCreateKnot_1720335274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1720335274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createKnot(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/decoration/LeashFenceKnotEntity;", cancellable = true)
    private static void createKnot_1720335274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1720335274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKnot(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private static void getKnot_314834221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(314834221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playPlacementSound()V", cancellable = true)
    private void playPlacementSound_1875264415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1875264415L))
            info.cancel();
    }


}
