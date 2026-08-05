package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal.class)
public class MoveBackToVillageGoal248153022Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__666287042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666287042L))
            info.setReturnValue(true);
    }


}
