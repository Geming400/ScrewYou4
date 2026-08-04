package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperBulbBlock.class)
public class WeatheringCopperBulbBlock1194555343Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__866389912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866389912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_1781739255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781739255L))
            info.setReturnValue(null);
    }


}
