package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperStairBlock.class)
public class WeatheringCopperStairBlock_1368766705Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__609182510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609182510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_567528879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(567528879L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.EXPOSED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1859755338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859755338L))
            info.setReturnValue(null);
    }


}
