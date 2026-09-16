package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ConduitBlockEntity.class)
public class ConduitBlockEntity1227107624Mixin {
        @Inject(at = @At("HEAD"), method = "isActive()Z", cancellable = true)
    private void isActive__1287269361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1287269361L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__895666245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895666245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_693713235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693713235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActiveRotation(F)F", cancellable = true)
    private void getActiveRotation_315871195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315871195L))
            info.setReturnValue(3.830474E8F);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/ConduitBlockEntity;)V", cancellable = true)
    private static void serverTick_1398141238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1398141238L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_648967745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648967745L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "clientTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/ConduitBlockEntity;)V", cancellable = true)
    private static void clientTick_1676313022(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1676313022L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHunting()Z", cancellable = true)
    private void isHunting_2002322202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002322202L))
            info.setReturnValue(true);
    }


}
