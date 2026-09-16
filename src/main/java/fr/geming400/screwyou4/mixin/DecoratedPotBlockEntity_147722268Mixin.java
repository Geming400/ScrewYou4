package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.DecoratedPotBlockEntity.class)
public class DecoratedPotBlockEntity_147722268Mixin {
        @Inject(at = @At("HEAD"), method = "getDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirection_942921519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942921519L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getLootTableSeed()J", cancellable = true)
    private void getLootTableSeed__1028459391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028459391L))
            info.setReturnValue(-3695007100654560108L);
    }

    @Inject(at = @At("HEAD"), method = "getLootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void getLootTable_1166296060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166296060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1975051602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1975051602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__385672122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-385672122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wobble(Lnet/minecraft/world/level/block/entity/DecoratedPotBlockEntity$WobbleStyle;)V", cancellable = true)
    private void wobble_2240204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2240204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__430417612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430417612L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "setLootTable(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void setLootTable__780839402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-780839402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag_34894009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(34894009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLootTableSeed(J)V", cancellable = true)
    private void setLootTableSeed__612361379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-612361379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "splitTheItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void splitTheItem_600530364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600530364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerBlockEntity()Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getContainerBlockEntity_2139168236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139168236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDecoratedPotInstance(Lnet/minecraft/world/level/block/entity/PotDecorations;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createDecoratedPotInstance_658758125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658758125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDecorations()Lnet/minecraft/world/level/block/entity/PotDecorations;", cancellable = true)
    private void getDecorations__1970203658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1970203658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDecoratedPotTemplate(Lnet/minecraft/world/level/block/entity/PotDecorations;)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private static void createDecoratedPotTemplate__816233842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816233842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent__1244637456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244637456L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTheItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getTheItem__1935601363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935601363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTheItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setTheItem__903960879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-903960879L))
            info.cancel();
    }


}
