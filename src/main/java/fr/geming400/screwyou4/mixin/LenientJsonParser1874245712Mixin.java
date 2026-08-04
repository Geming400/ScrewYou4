package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.LenientJsonParser.class)
public class LenientJsonParser1874245712Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Ljava/io/Reader;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void parse__1850559644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850559644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void parse_275575902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(275575902L))
            info.setReturnValue(null);
    }


}
