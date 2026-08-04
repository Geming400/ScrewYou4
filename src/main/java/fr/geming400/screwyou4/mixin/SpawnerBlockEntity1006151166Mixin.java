package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SpawnerBlockEntity.class)
public class SpawnerBlockEntity1006151166Mixin {
        @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__160470382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160470382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/SpawnerBlockEntity;)V", cancellable = true)
    private static void clientTick__1832477194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1832477194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent_10275541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10275541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpawner()Lnet/minecraft/world/level/BaseSpawner;", cancellable = true)
    private void getSpawner_1931232999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931232999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__8401896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-8401896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_9299394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9299394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEntityId(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void setEntityId_1452046450(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1452046450L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/SpawnerBlockEntity;)V", cancellable = true)
    private static void serverTick__1832477194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1832477194L))
            info.cancel();
    }


}
