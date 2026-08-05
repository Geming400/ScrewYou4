package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CommonLinks.class)
public class CommonLinks2032759648Mixin {
        @Inject(at = @At("HEAD"), method = "extendRealms(Ljava/lang/String;Ljava/util/UUID;Z)Ljava/lang/String;", cancellable = true)
    private static void extendRealms__1939711561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939711561L))
            info.setReturnValue("OA9$!GSF!T");
    }

    @Inject(at = @At("HEAD"), method = "extendRealms(Ljava/lang/String;Ljava/util/UUID;)Ljava/lang/String;", cancellable = true)
    private static void extendRealms_270065473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270065473L))
            info.setReturnValue("\uC2CBiv6A8\u8F9C\uCD9Bq\uD21Ex((&^");
    }


}
