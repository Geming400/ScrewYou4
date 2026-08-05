package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.ParserUtils.class)
public class ParserUtils_276451356Mixin {
        @Inject(at = @At("HEAD"), method = "readWhile(Lcom/mojang/brigadier/StringReader;Lnet/minecraft/CharPredicate;)Ljava/lang/String;", cancellable = true)
    private static void readWhile_2071063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071063L))
            info.setReturnValue("s\uD18E-Gglz[1u[y,9hcg>H;yb\u3075:mJ(]1DQ'e0)\u22F6m2/(\u24006<uj{sD\u59A2Y\u3862WF48OU<?,|yFN@$&U\u263AI29\u0321<\"]\uFF6B'\u7915*{3r\uFC53");
    }


}
