package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopper.WeatherState.class)
public class WeatherState1914943236Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private static void values__577168403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577168403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private static void valueOf__110527610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-110527610L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.UNAFFECTED);
    }

    @Inject(at = @At("HEAD"), method = "next()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void next__1568525735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1568525735L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.UNAFFECTED);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private static void forEach_1431433283(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1431433283L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "previous()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void previous__206834731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206834731L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.WEATHERED);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2003151858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003151858L))
            info.setReturnValue("D{!p7#%\uA19F\uD071G4\"H_wh\u1B14!w\uD72As]\u88DC");
    }


}
