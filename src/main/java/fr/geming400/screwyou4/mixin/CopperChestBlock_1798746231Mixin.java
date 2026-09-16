package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CopperChestBlock.class)
public class CopperChestBlock_1798746231Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getState__995843357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995843357L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.OXIDIZED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1429775812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429775812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__670442250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670442250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldChangedStateKeepBlockEntity(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void shouldChangedStateKeepBlockEntity__895497567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895497567L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getHingeSound(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;Z)Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private static void getHingeSound__205397211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205397211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFromCopperBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void getFromCopperBlock__673620561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673620561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWaxed()Z", cancellable = true)
    private void isWaxed__436048118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436048118L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "chestCanConnectTo(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void chestCanConnectTo__42463258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42463258L))
            info.setReturnValue(false);
    }


}
