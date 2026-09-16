package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BlockItem.class)
public class BlockItem_187515086Mixin {
        @Inject(at = @At("HEAD"), method = "getBlock()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getBlock_1390617291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390617291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void place__1984399471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1984399471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlocks(Ljava/util/Map;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void registerBlocks_239122325(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(239122325L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDestroyed(Lnet/minecraft/world/entity/item/ItemEntity;)V", cancellable = true)
    private void onDestroyed__687880482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-687880482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__727602148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-727602148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldPrintOpWarning(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void shouldPrintOpWarning_858173539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858173539L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "updatePlacementContext(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/item/context/BlockPlaceContext;", cancellable = true)
    private void updatePlacementContext__727551457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-727551457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateCustomBlockEntityTag(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void updateCustomBlockEntityTag_293207719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293207719L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canFitInsideContainerItems()Z", cancellable = true)
    private void canFitInsideContainerItems__1331907224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331907224L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntityData(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/entity/BlockEntityType;Lnet/minecraft/world/level/storage/TagValueOutput;)V", cancellable = true)
    private static void setBlockEntityData__654464705(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-654464705L))
            info.cancel();
    }


}
