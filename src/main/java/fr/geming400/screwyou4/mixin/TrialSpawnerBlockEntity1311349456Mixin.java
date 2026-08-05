package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TrialSpawnerBlockEntity.class)
public class TrialSpawnerBlockEntity1311349456Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;", cancellable = true)
    private void getState_1932631620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932631620L))
            info.setReturnValue(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerState.EJECTING_REWARD);
    }

    @Inject(at = @At("HEAD"), method = "setState(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;)V", cancellable = true)
    private void setState_2094048379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2094048379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_144727908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144727908L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket_296796394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296796394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_314497684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(314497684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEntityId(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void setEntityId_1757244740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1757244740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markUpdated()V", cancellable = true)
    private void markUpdated_1349624195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1349624195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTrialSpawner()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner;", cancellable = true)
    private void getTrialSpawner__1771061827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771061827L))
            info.setReturnValue(null);
    }


}
