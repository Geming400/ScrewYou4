package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.HopperBlockEntity.class)
public class HopperBlockEntity1217131982Mixin {
        @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem__468234542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468234542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addItem(Lnet/minecraft/world/Container;Lnet/minecraft/world/Container;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void addItem_1231536313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1231536313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addItem(Lnet/minecraft/world/Container;Lnet/minecraft/world/entity/item/ItemEntity;)Z", cancellable = true)
    private static void addItem_1250727420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250727420L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLevelX()D", cancellable = true)
    private void getLevelX_1255389423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255389423L))
            info.setReturnValue(2.839498004862505E8D);
    }

    @Inject(at = @At("HEAD"), method = "getLevelY()D", cancellable = true)
    private void getLevelY_1255389423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255389423L))
            info.setReturnValue(2.839498004862505E8D);
    }

    @Inject(at = @At("HEAD"), method = "getLevelZ()D", cancellable = true)
    private void getLevelZ_1255389423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255389423L))
            info.setReturnValue(2.839498004862505E8D);
    }

    @Inject(at = @At("HEAD"), method = "isGridAligned()Z", cancellable = true)
    private void isGridAligned_1255410565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255410565L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "pushItemsTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/HopperBlockEntity;)V", cancellable = true)
    private static void pushItemsTick_1040163406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1040163406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemsAtAndAbove(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/Hopper;)Ljava/util/List;", cancellable = true)
    private static void getItemsAtAndAbove_179569264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179569264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerAt(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/Container;", cancellable = true)
    private static void getContainerAt_1340845535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340845535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "suckInItems(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/Hopper;)Z", cancellable = true)
    private static void suckInItems__292033981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-292033981L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem__127621473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-127621473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlockState_1071839152(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1071839152L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_1255394228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255394228L))
            info.setReturnValue(1875530459);
    }

    @Inject(at = @At("HEAD"), method = "entityInside(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/block/entity/HopperBlockEntity;)V", cancellable = true)
    private static void entityInside_1832637951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1832637951L))
            info.cancel();
    }


}
