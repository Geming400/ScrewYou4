package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ConduitBlockEntity.class)
public class ConduitBlockEntity1227107624Mixin {
        @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive_1265386207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1265386207L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isHunting()Z", cancellable = true)
    private void isHunting_1265386207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1265386207L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_60486076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60486076L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_230255852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(230255852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket_212554562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212554562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/ConduitBlockEntity;)V", cancellable = true)
    private static void clientTick_1012422070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1012422070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/ConduitBlockEntity;)V", cancellable = true)
    private static void serverTick_1012422070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1012422070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getActiveRotation(F)F", cancellable = true)
    private void getActiveRotation__1856728639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856728639L))
            info.setReturnValue(1.3652301E7F);
    }


}
