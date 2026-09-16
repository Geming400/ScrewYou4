package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Crypt.SaltSupplier.class)
public class SaltSupplier451365478Mixin {
        @Inject(at = @At("HEAD"), method = "getLong()J", cancellable = true)
    private static void getLong_516848979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516848979L))
            info.setReturnValue(6327213730096782823L);
    }


}
