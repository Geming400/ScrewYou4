package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TheEndGatewayBlockEntity.class)
public class TheEndGatewayBlockEntity_1688217876Mixin {
        @Inject(at = @At("HEAD"), method = "shouldRenderFace(Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void shouldRenderFace_568295638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568295638L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent_692342250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692342250L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setExitPosition(Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void setExitPosition__1626852228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1626852228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getParticleAmount()I", cancellable = true)
    private void getParticleAmount_1726480121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726480121L))
            info.setReturnValue(299440186);
    }

    @Inject(at = @At("HEAD"), method = "triggerCooldown(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/TheEndGatewayBlockEntity;)V", cancellable = true)
    private static void triggerCooldown_2043486813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2043486813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isCoolingDown()Z", cancellable = true)
    private void isCoolingDown_1726496458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726496458L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "beamAnimationTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/TheEndGatewayBlockEntity;)V", cancellable = true)
    private static void beamAnimationTick_2043486813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2043486813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPortalPosition(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPortalPosition__1104793233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104793233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnPercent(F)F", cancellable = true)
    private void getSpawnPercent__1395618388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395618388L))
            info.setReturnValue(6.648471E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCooldownPercent(F)F", cancellable = true)
    private void getCooldownPercent__1395618388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395618388L))
            info.setReturnValue(6.648471E8F);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_521596327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521596327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket_673664813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(673664813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_691366103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(691366103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "portalTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/TheEndGatewayBlockEntity;)V", cancellable = true)
    private static void portalTick_2043486813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2043486813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSpawning()Z", cancellable = true)
    private void isSpawning_1726496458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726496458L))
            info.setReturnValue(false);
    }


}
