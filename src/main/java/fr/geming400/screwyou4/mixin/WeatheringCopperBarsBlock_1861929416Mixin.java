package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperBarsBlock.class)
public class WeatheringCopperBarsBlock_1861929416Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__199015840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199015840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge__1845853969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845853969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__697184157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697184157L))
            info.setReturnValue(null);
    }


}
