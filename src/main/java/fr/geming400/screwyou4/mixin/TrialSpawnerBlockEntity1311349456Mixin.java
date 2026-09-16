package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TrialSpawnerBlockEntity.class)
public class TrialSpawnerBlockEntity1311349456Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;", cancellable = true)
    private void getState_396805257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(396805257L))
            info.setReturnValue(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerState.INACTIVE);
    }

    @Inject(at = @At("HEAD"), method = "setState(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawnerState;)V", cancellable = true)
    private void setState_1091693452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1091693452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__811424413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811424413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_777955067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777955067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markUpdated()V", cancellable = true)
    private void markUpdated__1788703467(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1788703467L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setEntityId(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void setEntityId__1148290460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1148290460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_733209577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733209577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTrialSpawner()Lnet/minecraft/world/level/block/entity/trialspawner/TrialSpawner;", cancellable = true)
    private void getTrialSpawner__1691085915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691085915L))
            info.setReturnValue(null);
    }


}
