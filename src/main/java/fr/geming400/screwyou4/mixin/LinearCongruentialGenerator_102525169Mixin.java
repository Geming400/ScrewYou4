package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.LinearCongruentialGenerator.class)
public class LinearCongruentialGenerator_102525169Mixin {
        @Inject(at = @At("HEAD"), method = "next(JJ)J", cancellable = true)
    private static void next__863812913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-863812913L))
            info.setReturnValue(-5700316010496969538L);
    }


}
