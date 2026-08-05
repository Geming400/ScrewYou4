package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CreakingHeartBlockEntity.class)
public class CreakingHeartBlockEntity_319564446Mixin {
        @Inject(at = @At("HEAD"), method = "getAnalogOutputSignal()I", cancellable = true)
    private void getAnalogOutputSignal_357826691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(357826691L))
            info.setReturnValue(-337473284);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/CreakingHeartBlockEntity;)V", cancellable = true)
    private static void serverTick_2104625585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2104625585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__847057103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-847057103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__694988617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694988617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__677287327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677287327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects_2095822163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2095822163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "computeAnalogOutputSignal()I", cancellable = true)
    private void computeAnalogOutputSignal_357826691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(357826691L))
            info.setReturnValue(-337473284);
    }

    @Inject(at = @At("HEAD"), method = "setCreakingInfo(Lnet/minecraft/world/entity/monster/creaking/Creaking;)V", cancellable = true)
    private void setCreakingInfo_381408640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(381408640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCreakingInfo(Ljava/util/UUID;)V", cancellable = true)
    private void setCreakingInfo__37991644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-37991644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeProtector(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void removeProtector__12109015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-12109015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "creakingHurt()V", cancellable = true)
    private void creakingHurt_357839184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(357839184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isProtector(Lnet/minecraft/world/entity/monster/creaking/Creaking;)Z", cancellable = true)
    private void isProtector_381412484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381412484L))
            info.setReturnValue(false);
    }


}
