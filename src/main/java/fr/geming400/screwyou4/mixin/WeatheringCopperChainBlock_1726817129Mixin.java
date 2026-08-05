package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperChainBlock.class)
public class WeatheringCopperChainBlock_1726817129Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__251132086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-251132086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_925579303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925579303L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.WEATHERED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1501704914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1501704914L))
            info.setReturnValue(null);
    }


}
