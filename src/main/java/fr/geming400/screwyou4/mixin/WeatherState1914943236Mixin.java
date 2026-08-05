package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopper.WeatherState.class)
public class WeatherState1914943236Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private static void values__1621299253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1621299253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private static void valueOf__2055391826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055391826L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.OXIDIZED);
    }

    @Inject(at = @At("HEAD"), method = "next()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void next__1792840148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792840148L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.EXPOSED);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private static void forEach__1699007399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1699007399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "previous()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void previous__1792840148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792840148L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.EXPOSED);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_779482765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779482765L))
            info.setReturnValue("y6G^}\u0367wPb`1(lVS\u99F4\u7859pO#Ze\uA188/!o> \u29632c\u8CE9>6");
    }


}
