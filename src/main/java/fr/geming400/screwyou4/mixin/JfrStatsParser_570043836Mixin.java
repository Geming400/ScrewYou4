package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.parse.JfrStatsParser.class)
public class JfrStatsParser_570043836Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Ljava/nio/file/Path;)Lnet/minecraft/util/profiling/jfr/parse/JfrStatsResult;", cancellable = true)
    private static void parse_1112475814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112475814L))
            info.setReturnValue(null);
    }


}
