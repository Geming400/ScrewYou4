package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V1451_6.class)
public class V1451_6_507369186Mixin {
        @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes__1446530176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1446530176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "packNamespacedWithDot(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void packNamespacedWithDot_1720111256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1720111256L))
            info.setReturnValue("钺v:7DobfX%=c5f");
    }


}
