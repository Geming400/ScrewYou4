package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity.class)
public class ShulkerBoxBlockEntity_890803741Mixin {
        @Inject(at = @At("HEAD"), method = "isClosed()Z", cancellable = true)
    private void isClosed_929082323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929082323L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/ShulkerBoxBlockEntity;)V", cancellable = true)
    private static void tick_577176679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(577176679L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects__1627905838(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1627905838L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getBoundingBox_470651459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(470651459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent__105071885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-105071885L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor__1968855326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968855326L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.PINK);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_929065986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929065986L))
            info.setReturnValue(1331141530);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItemThroughFace(ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canPlaceItemThroughFace__1943367811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943367811L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemThroughFace(ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canTakeItemThroughFace__1943367811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943367811L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSlotsForFace(Lnet/minecraft/core/Direction;)[I", cancellable = true)
    private void getSlotsForFace_532158045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532158045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProgress(F)F", cancellable = true)
    private void getProgress_2101934773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101934773L))
            info.setReturnValue(4.566564E8F);
    }

    @Inject(at = @At("HEAD"), method = "loadFromTag(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void loadFromTag_1122040373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1122040373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_222655373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(222655373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen_222655373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(222655373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAnimationStatus()Lnet/minecraft/world/level/block/entity/ShulkerBoxBlockEntity$AnimationStatus;", cancellable = true)
    private void getAnimationStatus__1036420363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1036420363L))
            info.setReturnValue(net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity.AnimationStatus.OPENED);
    }


}
