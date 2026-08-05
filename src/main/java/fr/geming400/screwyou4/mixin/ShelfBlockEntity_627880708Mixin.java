package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ShelfBlockEntity.class)
public class ShelfBlockEntity_627880708Mixin {
        @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position_1725610236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725610236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void level__1948387361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1948387361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getItems__542281413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-542281413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1568486197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1568486197L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getVisualRotationYInDegrees()F", cancellable = true)
    private void getVisualRotationYInDegrees_666140070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666140070L))
            info.setReturnValue(9.456054E8F);
    }

    @Inject(at = @At("HEAD"), method = "swapItemNoUpdate(ILnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void swapItemNoUpdate__941154231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941154231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__538740841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538740841L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__386672355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386672355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__368971065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-368971065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag__591250645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-591250645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged(Lnet/minecraft/core/Holder$Reference;)V", cancellable = true)
    private void setChanged_1705247582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1705247582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_666155446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(666155446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAlignItemsToBottom()Z", cancellable = true)
    private void getAlignItemsToBottom_666159290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666159290L))
            info.setReturnValue(true);
    }


}
