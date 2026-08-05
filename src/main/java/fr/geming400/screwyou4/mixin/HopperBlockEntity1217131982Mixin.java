package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.HopperBlockEntity.class)
public class HopperBlockEntity1217131982Mixin {
        @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__838632760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838632760L))
            info.setReturnValue(927259905);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlockState__34389270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-34389270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityInside(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/block/entity/HopperBlockEntity;)V", cancellable = true)
    private static void entityInside_901252606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(901252606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_1133594356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1133594356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isGridAligned()Z", cancellable = true)
    private void isGridAligned_1405245265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405245265L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getContainerAt(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/Container;", cancellable = true)
    private static void getContainerAt__761855423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761855423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushItemsTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/HopperBlockEntity;)V", cancellable = true)
    private static void pushItemsTick__429872021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-429872021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemsAtAndAbove(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/Hopper;)Ljava/util/List;", cancellable = true)
    private static void getItemsAtAndAbove_261496819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(261496819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "suckInItems(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/Hopper;)Z", cancellable = true)
    private static void suckInItems_525361906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525361906L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLevelZ()D", cancellable = true)
    private void getLevelZ__1808396253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808396253L))
            info.setReturnValue(4.131313005616958E8D);
    }

    @Inject(at = @At("HEAD"), method = "getLevelY()D", cancellable = true)
    private void getLevelY__1837025404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1837025404L))
            info.setReturnValue(4.1313130066039693E8D);
    }

    @Inject(at = @At("HEAD"), method = "getLevelX()D", cancellable = true)
    private void getLevelX__1865654555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865654555L))
            info.setReturnValue(4.131313008773913E8D);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem_452804553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452804553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addItem(Lnet/minecraft/world/Container;Lnet/minecraft/world/Container;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void addItem_324455437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(324455437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addItem(Lnet/minecraft/world/Container;Lnet/minecraft/world/entity/item/ItemEntity;)Z", cancellable = true)
    private static void addItem__1565786800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565786800L))
            info.setReturnValue(true);
    }


}
