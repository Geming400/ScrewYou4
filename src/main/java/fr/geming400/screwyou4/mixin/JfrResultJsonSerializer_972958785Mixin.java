package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.serialize.JfrResultJsonSerializer.class)
public class JfrResultJsonSerializer_972958785Mixin {
        @Inject(at = @At("HEAD"), method = "format(Lnet/minecraft/util/profiling/jfr/parse/JfrStatsResult;)Ljava/lang/String;", cancellable = true)
    private void format__1267748360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1267748360L))
            info.setReturnValue("\uCB2B\u11B9($M7\u81AEf=@v;?{#8\uFEC1XV\u7DAEZ(\u87CFc0n:Kx7[0p3TsCA9x\uB4D8g|**Dr!");
    }


}
