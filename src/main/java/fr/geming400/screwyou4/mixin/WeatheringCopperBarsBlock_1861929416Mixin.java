package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperBarsBlock.class)
public class WeatheringCopperBarsBlock_1861929416Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__116019799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116019799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_1060691590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060691590L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.WEATHERED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1366592627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366592627L))
            info.setReturnValue(null);
    }


}
