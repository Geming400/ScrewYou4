package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.LinearCongruentialGenerator.class)
public class LinearCongruentialGenerator_102525169Mixin {
        @Inject(at = @At("HEAD"), method = "next(JJ)J", cancellable = true)
    private static void next__1176629124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176629124L))
            info.setReturnValue(1803779004638905669L);
    }


}
