package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DoorBlock.class)
public class DoorBlock1011844145Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/block/state/properties/BlockSetType;", cancellable = true)
    private void type_591204710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591204710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpen(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isOpen_866555159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866555159L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1547269427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1547269427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__246755622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246755622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_289787984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289787984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__1555691003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1555691003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isWoodenDoor(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isWoodenDoor_1839453477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839453477L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isWoodenDoor(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isWoodenDoor_866555407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866555407L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setOpen(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void setOpen__1496456257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1496456257L))
            info.cancel();
    }


}
