package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.WeatherData.class)
public class WeatherData1667103872Mixin {
        @Inject(at = @At("HEAD"), method = "isThundering()Z", cancellable = true)
    private void isThundering_1705382455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705382455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRaining()Z", cancellable = true)
    private void isRaining_1705382455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705382455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setThundering(Z)V", cancellable = true)
    private void setThundering__1398246595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1398246595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setThunderTime(I)V", cancellable = true)
    private void setThunderTime__1413946452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1413946452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRainTime(I)V", cancellable = true)
    private void setRainTime__1413946452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1413946452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setClearWeatherTime(I)V", cancellable = true)
    private void setClearWeatherTime__1413946452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1413946452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRaining(Z)V", cancellable = true)
    private void setRaining__1398246595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1398246595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getThunderTime()I", cancellable = true)
    private void getThunderTime_1705366118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705366118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRainTime()I", cancellable = true)
    private void getRainTime_1705366118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705366118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClearWeatherTime()I", cancellable = true)
    private void getClearWeatherTime_1705366118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705366118L))
            info.setReturnValue(null);
    }


}
