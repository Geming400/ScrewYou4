package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StrictJsonParser.class)
public class StrictJsonParser_663436842Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Ljava/io/Reader;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void parse_1233598781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233598781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void parse__935232969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-935232969L))
            info.setReturnValue(null);
    }


}
