package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerBlockEntity.class)
public class BannerBlockEntity1377555926Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_869492778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869492778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_883390595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883390595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCustomName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getCustomName__1824665221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824665221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__745217943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745217943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_844161537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844161537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPatterns()Lnet/minecraft/world/level/block/entity/BannerPatternLayers;", cancellable = true)
    private void getPatterns_1373655525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373655525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getBaseColor_21672640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21672640L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.LIME);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_799416047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799416047L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_1264727668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1264727668L))
            info.cancel();
    }


}
