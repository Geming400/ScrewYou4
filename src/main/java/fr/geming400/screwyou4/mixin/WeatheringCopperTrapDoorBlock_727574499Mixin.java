package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperTrapDoorBlock.class)
public class WeatheringCopperTrapDoorBlock_727574499Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__1333370757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333370757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_1314758410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314758410L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.WEATHERED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1831539074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1831539074L))
            info.setReturnValue(null);
    }


}
