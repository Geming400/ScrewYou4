package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.DecoratedPotBlockEntity.class)
public class DecoratedPotBlockEntity_147722268Mixin {
        @Inject(at = @At("HEAD"), method = "getDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirection__615133018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615133018L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "removeComponentsFromTag(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void removeComponentsFromTag__1071409085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1071409085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__866830795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866830795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__849129505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-849129505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__1018899281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1018899281L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "setLootTable(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void setLootTable_335391570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(335391570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLootTableSeed(J)V", cancellable = true)
    private void setLootTableSeed_1362562760(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1362562760L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLootTable()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void getLootTable_956213580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(956213580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent__848153358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848153358L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "wobble(Lnet/minecraft/world/level/block/entity/DecoratedPotBlockEntity$WobbleStyle;)V", cancellable = true)
    private void wobble_1642757949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1642757949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLootTableSeed()J", cancellable = true)
    private void getLootTableSeed_185985474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185985474L))
            info.setReturnValue(-3721918918853705890L);
    }

    @Inject(at = @At("HEAD"), method = "splitTheItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void splitTheItem_1541640486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541640486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerBlockEntity()Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getContainerBlockEntity_706858215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706858215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDecoratedPotTemplate(Lnet/minecraft/world/level/block/entity/PotDecorations;)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private static void createDecoratedPotTemplate_1965391522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965391522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDecoratedPotInstance(Lnet/minecraft/world/level/block/entity/PotDecorations;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createDecoratedPotInstance__1381229188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1381229188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDecorations()Lnet/minecraft/world/level/block/entity/PotDecorations;", cancellable = true)
    private void getDecorations_57685155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57685155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTheItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setTheItem_1882253555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1882253555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTheItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getTheItem_671140927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671140927L))
            info.setReturnValue(null);
    }


}
