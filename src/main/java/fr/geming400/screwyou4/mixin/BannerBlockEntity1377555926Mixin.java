package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerBlockEntity.class)
public class BannerBlockEntity1377555926Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__799353239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-799353239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1900974586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1900974586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_158424574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(158424574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket_363002864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363002864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_380704154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380704154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_210934378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210934378L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getCustomName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getCustomName__799353239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-799353239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPatterns()Lnet/minecraft/world/level/block/entity/BannerPatternLayers;", cancellable = true)
    private void getPatterns__598682228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598682228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getBaseColor__1482103140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482103140L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.BROWN);
    }


}
