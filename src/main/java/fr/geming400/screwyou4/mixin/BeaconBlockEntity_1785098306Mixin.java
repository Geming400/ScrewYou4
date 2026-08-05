package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BeaconBlockEntity.class)
public class BeaconBlockEntity_1785098306Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__391810860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391810860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__391810860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391810860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BeaconBlockEntity;)V", cancellable = true)
    private static void tick_564591825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(564591825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void setLevel_780123363(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(780123363L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSound(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;)V", cancellable = true)
    private static void playSound_490075644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(490075644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCustomName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setCustomName__116080632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-116080632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCustomName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getCustomName__391810860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391810860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRemoved()V", cancellable = true)
    private void setRemoved_1823373044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1823373044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_618476757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618476757L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_788246533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788246533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket_770545243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770545243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_565966953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(565966953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "validateEffects(Lnet/minecraft/core/Holder;Lnet/minecraft/core/Holder;I)Z", cancellable = true)
    private static void validateEffects__452418359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-452418359L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBeamSections()Ljava/util/List;", cancellable = true)
    private void getBeamSections__883532175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883532175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMenu(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void createMenu__200273061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-200273061L))
            info.setReturnValue(null);
    }


}
