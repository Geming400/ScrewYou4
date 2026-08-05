package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V4307.class)
public class V43071341579566Mixin {
        @Inject(at = @At("HEAD"), method = "components(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/SequencedMap;", cancellable = true)
    private static void components__3845051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-3845051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes_1303359223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303359223L))
            info.cancel();
    }


}
