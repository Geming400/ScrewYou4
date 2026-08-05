package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StrictJsonParser.class)
public class StrictJsonParser_663436842Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Ljava/io/Reader;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void parse_1387103978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387103978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void parse_554373284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554373284L))
            info.setReturnValue(null);
    }


}
