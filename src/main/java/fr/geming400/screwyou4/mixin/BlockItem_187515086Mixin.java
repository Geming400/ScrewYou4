package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BlockItem.class)
public class BlockItem_187515086Mixin {
        @Inject(at = @At("HEAD"), method = "getBlock()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getBlock__569750014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-569750014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void place_1436285304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436285304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDestroyed(Lnet/minecraft/world/entity/item/ItemEntity;)V", cancellable = true)
    private void onDestroyed__251453800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-251453800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerBlocks(Ljava/util/Map;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void registerBlocks_425831486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(425831486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntityData(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/entity/BlockEntityType;Lnet/minecraft/world/level/storage/TagValueOutput;)V", cancellable = true)
    private static void setBlockEntityData_2133427735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2133427735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePlacementContext(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/item/context/BlockPlaceContext;", cancellable = true)
    private void updatePlacementContext_1248723116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1248723116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateCustomBlockEntityTag(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void updateCustomBlockEntityTag__1626528501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626528501L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canFitInsideContainerItems()Z", cancellable = true)
    private void canFitInsideContainerItems_225793668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225793668L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldPrintOpWarning(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void shouldPrintOpWarning_1999049956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999049956L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1721328170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721328170L))
            info.setReturnValue(null);
    }


}
