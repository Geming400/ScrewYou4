package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.ScoreboardSaveData.class)
public class ScoreboardSaveData1377181323Mixin {
        @Inject(at = @At("HEAD"), method = "getData()Lnet/minecraft/world/scores/ScoreboardSaveData$Packed;", cancellable = true)
    private void getData_1064514645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064514645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setData(Lnet/minecraft/world/scores/ScoreboardSaveData$Packed;)V", cancellable = true)
    private void setData_1737912573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1737912573L))
            info.cancel();
    }


}
