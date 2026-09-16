package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CopperGolemStatueBlock.class)
public class CopperGolemStatueBlock_1947943174Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1280578869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1280578869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldChangedStateKeepBlockEntity(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void shouldChangedStateKeepBlockEntity__746300624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-746300624L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_2089518558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2089518558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeatheringState()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getWeatheringState_25160064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(25160064L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.UNAFFECTED);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__521245307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-521245307L))
            info.setReturnValue(null);
    }


}
