package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.WeatherData.class)
public class WeatherData1667103872Mixin {
        @Inject(at = @At("HEAD"), method = "isRaining()Z", cancellable = true)
    private void isRaining__40140429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-40140429L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isThundering()Z", cancellable = true)
    private void isThundering__184712721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-184712721L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setClearWeatherTime(I)V", cancellable = true)
    private void setClearWeatherTime__1839514622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1839514622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setThundering(Z)V", cancellable = true)
    private void setThundering__1440007747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1440007747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getThunderTime()I", cancellable = true)
    private void getThunderTime_2011685547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011685547L))
            info.setReturnValue(-917602394);
    }

    @Inject(at = @At("HEAD"), method = "getRainTime()I", cancellable = true)
    private void getRainTime__1053126961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053126961L))
            info.setReturnValue(1048880840);
    }

    @Inject(at = @At("HEAD"), method = "getClearWeatherTime()I", cancellable = true)
    private void getClearWeatherTime_1941529820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941529820L))
            info.setReturnValue(-794812637);
    }

    @Inject(at = @At("HEAD"), method = "setThunderTime(I)V", cancellable = true)
    private void setThunderTime__1118902149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1118902149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRainTime(I)V", cancellable = true)
    private void setRainTime__1968038801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1968038801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRaining(Z)V", cancellable = true)
    private void setRaining__497567927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-497567927L))
            info.cancel();
    }


}
