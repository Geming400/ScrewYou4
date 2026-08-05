package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperGolemStatueBlock.class)
public class WeatheringCopperGolemStatueBlock2092179784Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge_114230570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114230570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_1290941959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290941959L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.WEATHERED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1136342258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136342258L))
            info.setReturnValue(null);
    }


}
