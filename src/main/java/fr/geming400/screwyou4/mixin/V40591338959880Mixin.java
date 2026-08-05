package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.schemas.V4059.class)
public class V40591338959880Mixin {
        @Inject(at = @At("HEAD"), method = "components(Lcom/mojang/datafixers/schemas/Schema;)Ljava/util/SequencedMap;", cancellable = true)
    private static void components__6464737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6464737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTypes(Lcom/mojang/datafixers/schemas/Schema;Ljava/util/Map;Ljava/util/Map;)V", cancellable = true)
    private void registerTypes_1300739537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1300739537L))
            info.cancel();
    }


}
