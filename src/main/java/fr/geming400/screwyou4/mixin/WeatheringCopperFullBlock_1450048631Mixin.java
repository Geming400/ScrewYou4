package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperFullBlock.class)
public class WeatheringCopperFullBlock_1450048631Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__527900584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527900584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_648810805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648810805L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.EXPOSED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1778473412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778473412L))
            info.setReturnValue(null);
    }


}
