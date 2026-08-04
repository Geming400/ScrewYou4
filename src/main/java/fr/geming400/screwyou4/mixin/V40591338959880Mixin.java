package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V4059.class)
public class V40591338959880Mixin {
        @Inject(at = @At("HEAD"), method = "components(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/SequencedMap;", cancellable = true)
    private static void components__631966327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-631966327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes__614939481(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-614939481L))
            info.cancel();
    }


}
