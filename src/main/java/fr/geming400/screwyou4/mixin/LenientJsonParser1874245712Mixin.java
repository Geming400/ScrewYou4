package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.LenientJsonParser.class)
public class LenientJsonParser1874245712Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Ljava/io/Reader;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void parse__1697054447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697054447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void parse_1765182155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765182155L))
            info.setReturnValue(null);
    }


}
