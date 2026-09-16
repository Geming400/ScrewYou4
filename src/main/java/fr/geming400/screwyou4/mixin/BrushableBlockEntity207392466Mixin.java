package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BrushableBlockEntity.class)
public class BrushableBlockEntity207392466Mixin {
        @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__286772865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-286772865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__326001923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326001923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1915381403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915381403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__370747413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370747413L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "setLootTable(Lnet/minecraft/resources/ResourceKey;J)V", cancellable = true)
    private void setLootTable_1515075383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1515075383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHitDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getHitDirection_158556799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(158556799L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "brush(JLnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/Direction;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void brush__1138651451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138651451L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkReset(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void checkReset__1444299377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1444299377L))
            info.cancel();
    }


}
