package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.DebugEntityNameGenerator.class)
public class DebugEntityNameGenerator_212969516Mixin {
        @Inject(at = @At("HEAD"), method = "getEntityName(Lnet/minecraft/world/entity/Entity;)Ljava/lang/String;", cancellable = true)
    private static void getEntityName_625852915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625852915L))
            info.setReturnValue("fmn0z4r\uCD57\uAE9FtjHaUP;F+%\u92DD]\uC16FK6CFAq`t.o\u7DCA-N)ezx/RRb)\u53C4..\u122AR&}6 RCTK#`\uB3F1F8]hoYG&no\u2BB7cV^U|&7N9=M,%h}'Kc\u8558");
    }

    @Inject(at = @At("HEAD"), method = "getEntityName(Ljava/util/UUID;)Ljava/lang/String;", cancellable = true)
    private static void getEntityName__981454504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981454504L))
            info.setReturnValue("f4\"/W\u1699'p \u649BI2]n![@\u7D06\uB0A7]t<a}\u35AC4ndhoNcmr28kM:FS\uA6BAg8ZS!)l#>2/");
    }


}
