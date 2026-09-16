package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SpawnerBlockEntity.class)
public class SpawnerBlockEntity1006151166Mixin {
        @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1116622703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116622703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_472756777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472756777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEntityId(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void setEntityId__1453488750(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1453488750L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clientTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/SpawnerBlockEntity;)V", cancellable = true)
    private static void clientTick__1168586242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1168586242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpawner()Lnet/minecraft/world/level/BaseSpawner;", cancellable = true)
    private void getSpawner_521007733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521007733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/SpawnerBlockEntity;)V", cancellable = true)
    private static void serverTick__1446758026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1446758026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_428011287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(428011287L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent__386208557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386208557L))
            info.setReturnValue(true);
    }


}
