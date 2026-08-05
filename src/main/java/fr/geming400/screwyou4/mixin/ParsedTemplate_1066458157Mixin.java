package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.action.ParsedTemplate.class)
public class ParsedTemplate_1066458157Mixin {
        @Inject(at = @At("HEAD"), method = "instantiate(Ljava/util/Map;)Ljava/lang/String;", cancellable = true)
    private void instantiate_915777328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915777328L))
            info.setReturnValue("M\uF95A5G\u9E49\uD0230n\uBB9A=]}(F\u5C0E[]zE\u95CF@\u4DE9I\uD173\uFC51o?A9 ;)|I4>I GH/D5#(g;i\"<\u8D4D?0,]^bY\"}\uFCA0KO\u4746KXV4\u26D7%O\uC69FJOM+");
    }


}
