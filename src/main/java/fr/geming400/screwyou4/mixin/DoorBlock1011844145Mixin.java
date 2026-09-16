package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DoorBlock.class)
public class DoorBlock1011844145Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/block/state/properties/BlockSetType;", cancellable = true)
    private void type_1076580332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076580332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpen(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isOpen__1976747005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976747005L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2078289399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078289399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__1779128197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1779128197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1457344335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457344335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_1338906743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1338906743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOpen(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void setOpen_685255539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(685255539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isWoodenDoor(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isWoodenDoor_334022839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334022839L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isWoodenDoor(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isWoodenDoor_1268700321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268700321L))
            info.setReturnValue(true);
    }


}
