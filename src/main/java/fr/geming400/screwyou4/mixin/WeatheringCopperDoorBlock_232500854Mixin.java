package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperDoorBlock.class)
public class WeatheringCopperDoorBlock_232500854Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__1745448361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745448361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge__568736972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568736972L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.OXIDIZED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1298946107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298946107L))
            info.setReturnValue(null);
    }


}
