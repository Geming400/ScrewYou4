package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.ScoreboardSaveData.class)
public class ScoreboardSaveData1377181323Mixin {
        @Inject(at = @At("HEAD"), method = "getData()Lnet/minecraft/world/scores/ScoreboardSaveData$Packed;", cancellable = true)
    private void getData__1470544843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1470544843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setData(Lnet/minecraft/world/scores/ScoreboardSaveData$Packed;)V", cancellable = true)
    private void setData_557317033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(557317033L))
            info.cancel();
    }


}
