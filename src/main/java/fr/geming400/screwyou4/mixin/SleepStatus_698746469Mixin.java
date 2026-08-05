package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.SleepStatus.class)
public class SleepStatus_698746469Mixin {
        @Inject(at = @At("HEAD"), method = "update(Ljava/util/List;)Z", cancellable = true)
    private void update__855214685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-855214685L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "areEnoughDeepSleeping(ILjava/util/List;)Z", cancellable = true)
    private void areEnoughDeepSleeping_192118976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(192118976L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "areEnoughSleeping(I)Z", cancellable = true)
    private void areEnoughSleeping__715930621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-715930621L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "amountSleeping()I", cancellable = true)
    private void amountSleeping_1750104071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750104071L))
            info.setReturnValue(2101798350);
    }

    @Inject(at = @At("HEAD"), method = "sleepersNeeded(I)I", cancellable = true)
    private void sleepersNeeded__1996520057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996520057L))
            info.setReturnValue(1046070577);
    }

    @Inject(at = @At("HEAD"), method = "removeAllSleepers()V", cancellable = true)
    private void removeAllSleepers__1640582197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1640582197L))
            info.cancel();
    }


}
