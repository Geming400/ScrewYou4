package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestEvent.class)
public class GameTestEvent_2041445656Mixin {
        @Inject(at = @At("HEAD"), method = "create(JLjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestEvent;", cancellable = true)
    private static void create_677047191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677047191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestEvent;", cancellable = true)
    private static void create__1064120879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064120879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithMinimumDelay(JLjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestEvent;", cancellable = true)
    private static void createWithMinimumDelay_677047191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677047191L))
            info.setReturnValue(null);
    }


}
