package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.action.ParsedTemplate.class)
public class ParsedTemplate_1066458157Mixin {
        @Inject(at = @At("HEAD"), method = "instantiate(Ljava/util/Map;)Ljava/lang/String;", cancellable = true)
    private void instantiate__992952358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992952358L))
            info.setReturnValue("\u4BFFe]\u6C36\uFFB58c#$[|g&)'(");
    }


}
