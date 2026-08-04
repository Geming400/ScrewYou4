package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BrushableBlockEntity.class)
public class BrushableBlockEntity207392466Mixin {
        @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_730811126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730811126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getHitDirection__555462819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555462819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__959229082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-959229082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__789459306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789459306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__807160596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807160596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "brush(JLnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/core/Direction;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void brush_1855836351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855836351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkReset(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void checkReset__771016874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-771016874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLootTable(Lnet/minecraft/resources/ResourceKey;J)V", cancellable = true)
    private void setLootTable_1758497147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1758497147L))
            info.cancel();
    }


}
