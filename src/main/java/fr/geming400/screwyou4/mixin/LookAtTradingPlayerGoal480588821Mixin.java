package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.LookAtTradingPlayerGoal.class)
public class LookAtTradingPlayerGoal480588821Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_518867404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518867404L))
            info.setReturnValue(false);
    }


}
