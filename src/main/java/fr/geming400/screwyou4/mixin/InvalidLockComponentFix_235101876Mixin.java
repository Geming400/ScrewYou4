package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.InvalidLockComponentFix.class)
public class InvalidLockComponentFix_235101876Mixin {
        @Inject(at = @At("HEAD"), method = "fixLock(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixLock_2142219754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142219754L))
            info.setReturnValue(null);
    }


}
