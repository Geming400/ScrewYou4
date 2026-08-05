package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestMainUtil.class)
public class GameTestMainUtil_743046079Mixin {
        @Inject(at = @At("HEAD"), method = "runGameTestServer([Ljava/lang/String;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void runGameTestServer__273969620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-273969620L))
            info.cancel();
    }


}
