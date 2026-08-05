package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperChainBlock.class)
public class WeatheringCopperChainBlock_1726817129Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__334128127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334128127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge__1980966256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980966256L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.WEATHERED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__832296444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832296444L))
            info.setReturnValue(null);
    }


}
