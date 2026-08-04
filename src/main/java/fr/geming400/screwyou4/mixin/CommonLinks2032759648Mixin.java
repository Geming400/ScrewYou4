package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CommonLinks.class)
public class CommonLinks2032759648Mixin {
        @Inject(at = @At("HEAD"), method = "extendRealms(Ljava/lang/String;Ljava/util/UUID;Z)Ljava/lang/String;", cancellable = true)
    private static void extendRealms__1470169227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1470169227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extendRealms(Ljava/lang/String;Ljava/util/UUID;)Ljava/lang/String;", cancellable = true)
    private static void extendRealms__684619325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-684619325L))
            info.setReturnValue(null);
    }


}
