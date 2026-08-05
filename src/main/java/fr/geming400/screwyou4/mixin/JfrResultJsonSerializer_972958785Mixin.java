package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.serialize.JfrResultJsonSerializer.class)
public class JfrResultJsonSerializer_972958785Mixin {
        @Inject(at = @At("HEAD"), method = "format(Lnet/minecraft/util/profiling/jfr/parse/JfrStatsResult;)Ljava/lang/String;", cancellable = true)
    private void format_946374799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946374799L))
            info.setReturnValue(".#W!$*QhC");
    }


}
