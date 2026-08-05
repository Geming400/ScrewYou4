package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.SleepStatus.class)
public class SleepStatus_698746469Mixin {
        @Inject(at = @At("HEAD"), method = "update(Ljava/util/List;)Z", cancellable = true)
    private void update__80468276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-80468276L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "areEnoughDeepSleeping(ILjava/util/List;)Z", cancellable = true)
    private void areEnoughDeepSleeping__1613695675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1613695675L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeAllSleepers()V", cancellable = true)
    private void removeAllSleepers_737021207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(737021207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "areEnoughSleeping(I)Z", cancellable = true)
    private void areEnoughSleeping_1912667284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912667284L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "amountSleeping()I", cancellable = true)
    private void amountSleeping_737008714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737008714L))
            info.setReturnValue(-1775576432);
    }

    @Inject(at = @At("HEAD"), method = "sleepersNeeded(I)I", cancellable = true)
    private void sleepersNeeded_1912650947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912650947L))
            info.setReturnValue(1793292122);
    }


}
