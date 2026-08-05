package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperSlabBlock.class)
public class WeatheringCopperSlabBlock886937470Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__1174007785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1174007785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_1474121382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474121382L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.OXIDIZED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1672176102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672176102L))
            info.setReturnValue(null);
    }


}
