package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CopperChestBlock.class)
public class CopperChestBlock_1798746231Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getState__1909037154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1909037154L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.EXPOSED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__760367342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760367342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHingeSound(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;Z)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private static void getHingeSound_509427071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509427071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chestCanConnectTo(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void chestCanConnectTo_1653457244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653457244L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_540146463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(540146463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldChangedStateKeepBlockEntity(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void shouldChangedStateKeepBlockEntity_1653457244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653457244L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isWaxed()Z", cancellable = true)
    private void isWaxed_1837024813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837024813L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFromCopperBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void getFromCopperBlock__205587997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205587997L))
            info.setReturnValue(null);
    }


}
