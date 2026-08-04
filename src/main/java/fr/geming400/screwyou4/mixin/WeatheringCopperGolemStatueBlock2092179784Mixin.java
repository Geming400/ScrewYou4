package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperGolemStatueBlock.class)
public class WeatheringCopperGolemStatueBlock2092179784Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge_31234529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(31234529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge__1615603600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615603600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__466933788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466933788L))
            info.setReturnValue(null);
    }


}
