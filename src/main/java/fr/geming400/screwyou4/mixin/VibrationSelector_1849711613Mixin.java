package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.vibrations.VibrationSelector.class)
public class VibrationSelector_1849711613Mixin {
        @Inject(at = @At("HEAD"), method = "startOver()V", cancellable = true)
    private void startOver_675165209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(675165209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "chosenCandidate(J)Ljava/util/Optional;", cancellable = true)
    private void chosenCandidate__984480161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984480161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCandidate(Lnet/minecraft/world/level/gameevent/vibrations/VibrationInfo;J)V", cancellable = true)
    private void addCandidate__202240015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-202240015L))
            info.cancel();
    }


}
