package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V1451_6.class)
public class V1451_6_507369186Mixin {
        @Inject(at = @At("HEAD"), method = "packNamespacedWithDot(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void packNamespacedWithDot_1886328441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886328441L))
            info.setReturnValue("{\u199Cnoyrj7D= \u747B>U+-]\u55F5o$>");
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes_469148842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(469148842L))
            info.cancel();
    }


}
