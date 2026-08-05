package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.validation.ContentValidationException.class)
public class ContentValidationException_1246311511Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage(Ljava/nio/file/Path;Ljava/util/List;)Ljava/lang/String;", cancellable = true)
    private static void getMessage_1884795079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884795079L))
            info.setReturnValue("l5fUJSG3W\uAFEEB.\u105Fa7dUeelafnD3^|o\u66ADRAr)(\"hL=|\uCAE5H2z3x\u86E1");
    }

    @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage_110851039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110851039L))
            info.setReturnValue("y]@B(sJ9\u936D\u130F,))X\u2596hQ5h\u848BX\uB6FAUHR(>qTkkfWhx2w\"Vo*hFxzf%Sc&\uAD40XTl\u222ASK\u3769j\u91B1!4M\uB8F1v\u2398T0\uA452'(et1$M:aAMe5L");
    }


}
