package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V3818_3.class)
public class V3818_32125244072Mixin {
        @Inject(at = @At("HEAD"), method = "components(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/SequencedMap;", cancellable = true)
    private static void components_779819455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779819455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes_2087023729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2087023729L))
            info.cancel();
    }


}
