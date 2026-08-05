package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperTrapDoorBlock.class)
public class WeatheringCopperTrapDoorBlock_727574499Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__1250374716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250374716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge__73663327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-73663327L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.UNAFFECTED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1794019752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1794019752L))
            info.setReturnValue(null);
    }


}
