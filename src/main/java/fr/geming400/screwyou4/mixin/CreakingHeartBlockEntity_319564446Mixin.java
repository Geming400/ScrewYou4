package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CreakingHeartBlockEntity.class)
public class CreakingHeartBlockEntity_319564446Mixin {
        @Inject(at = @At("HEAD"), method = "getAnalogOutputSignal()I", cancellable = true)
    private void getAnalogOutputSignal_442878932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442878932L))
            info.setReturnValue(1269244948);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/CreakingHeartBlockEntity;)V", cancellable = true)
    private static void serverTick_2074936625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2074936625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeProtector(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void removeProtector__1342899977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1342899977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCreakingInfo(Lnet/minecraft/world/entity/monster/creaking/Creaking;)V", cancellable = true)
    private void setCreakingInfo__2111012466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2111012466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCreakingInfo(Ljava/util/UUID;)V", cancellable = true)
    private void setCreakingInfo__640134734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-640134734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "computeAnalogOutputSignal()I", cancellable = true)
    private void computeAnalogOutputSignal__135830061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135830061L))
            info.setReturnValue(903588727);
    }

    @Inject(at = @At("HEAD"), method = "creakingHurt()V", cancellable = true)
    private void creakingHurt_1621577055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1621577055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isProtector(Lnet/minecraft/world/entity/monster/creaking/Creaking;)Z", cancellable = true)
    private void isProtector__1777351524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777351524L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects__280581257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-280581257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1803209424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803209424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__213829944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213829944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__258575434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-258575434L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
