package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SingleKeyCache.class)
public class SingleKeyCache_664305775Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void getValue_676383725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676383725L))
            info.setReturnValue(null);
    }


}
