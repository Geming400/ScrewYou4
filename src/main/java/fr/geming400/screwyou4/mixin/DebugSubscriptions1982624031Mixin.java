package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugSubscriptions.class)
public class DebugSubscriptions1982624031Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/util/debug/DebugSubscription;", cancellable = true)
    private static void bootstrap__312781044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-312781044L))
            info.setReturnValue(null);
    }


}
