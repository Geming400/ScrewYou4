package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperDoorBlock.class)
public class WeatheringCopperDoorBlock_232500854Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__1828444402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828444402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_819684765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(819684765L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.WEATHERED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1968354577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968354577L))
            info.setReturnValue(null);
    }


}
