package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity.class)
public class ShulkerBoxBlockEntity_890803741Mixin {
        @Inject(at = @At("HEAD"), method = "isClosed()Z", cancellable = true)
    private void isClosed_68119133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(68119133L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/ShulkerBoxBlockEntity;)V", cancellable = true)
    private static void tick__311914582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-311914582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getBoundingBox_1372549778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372549778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__1164961002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1164961002L))
            info.setReturnValue(605509744);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor_1518794901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518794901L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "loadFromTag(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void loadFromTag_1598828075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1598828075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProgress(F)F", cancellable = true)
    private void getProgress_1721005080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721005080L))
            info.setReturnValue(9.018358E8F);
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects_290658038(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(290658038L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSlotsForFace(Lnet/minecraft/core/Direction;)[I", cancellable = true)
    private void getSlotsForFace__1427773404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427773404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItemThroughFace(ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canPlaceItemThroughFace_1974448405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1974448405L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemThroughFace(ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canTakeItemThroughFace_1930932149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930932149L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent__501555983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501555983L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_437875777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(437875777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen__162149215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-162149215L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAnimationStatus()Lnet/minecraft/world/level/block/entity/ShulkerBoxBlockEntity$AnimationStatus;", cancellable = true)
    private void getAnimationStatus_379558229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379558229L))
            info.setReturnValue(net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity.AnimationStatus.OPENED);
    }


}
