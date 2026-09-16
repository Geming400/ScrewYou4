package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BeaconBlockEntity.class)
public class BeaconBlockEntity_1785098306Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_1277035157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277035157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1329456821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1329456821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BeaconBlockEntity;)V", cancellable = true)
    private static void tick_241082772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(241082772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void setLevel__886581339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-886581339L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSound(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;)V", cancellable = true)
    private static void playSound__1815246153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1815246153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCustomName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getCustomName__1417122842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417122842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCustomName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setCustomName__1591932502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1591932502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMenu(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void createMenu__1927504832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927504832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__337675564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-337675564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_1251703916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251703916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRemoved()V", cancellable = true)
    private void setRemoved__411686890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-411686890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_1206958426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206958426L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_1672270047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1672270047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "validateEffects(Lnet/minecraft/core/Holder;Lnet/minecraft/core/Holder;I)Z", cancellable = true)
    private static void validateEffects_8478165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(8478165L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBeamSections()Ljava/util/List;", cancellable = true)
    private void getBeamSections__795971484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795971484L))
            info.setReturnValue(null);
    }


}
