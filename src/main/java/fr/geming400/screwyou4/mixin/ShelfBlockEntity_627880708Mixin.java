package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ShelfBlockEntity.class)
public class ShelfBlockEntity_627880708Mixin {
        @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position_1205438259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205438259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void level__1446379813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446379813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_94486318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94486318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1494893162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494893162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1406030463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406030463L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "swapItemNoUpdate(ILnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void swapItemNoUpdate__1813469447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1813469447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAlignItemsToBottom()Z", cancellable = true)
    private void getAlignItemsToBottom__1244077117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244077117L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged__807766780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-807766780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged(Lnet/minecraft/core/Holder$Reference;)V", cancellable = true)
    private void setChanged_1613947088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1613947088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getItems_1051214405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051214405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_49740828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(49740828L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_515052449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(515052449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVisualRotationYInDegrees()F", cancellable = true)
    private void getVisualRotationYInDegrees_1233442569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233442569L))
            info.setReturnValue(4.253477E8F);
    }


}
