package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CopperGolemStatueBlock.class)
public class CopperGolemStatueBlock_1947943174Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__611170399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611170399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldChangedStateKeepBlockEntity(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void shouldChangedStateKeepBlockEntity_1802654187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802654187L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_689343406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(689343406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeatheringState()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getWeatheringState__1759840211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759840211L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.UNAFFECTED);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_362465518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(362465518L))
            info.setReturnValue(null);
    }


}
