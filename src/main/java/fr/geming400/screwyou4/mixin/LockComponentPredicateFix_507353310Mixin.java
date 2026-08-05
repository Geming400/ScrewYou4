package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.LockComponentPredicateFix.class)
public class LockComponentPredicateFix_507353310Mixin {
        @Inject(at = @At("HEAD"), method = "fixLock(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixLock_2140781300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140781300L))
            info.setReturnValue(null);
    }


}
