package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestEvent.class)
public class GameTestEvent_2041445656Mixin {
        @Inject(at = @At("HEAD"), method = "create(JLjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestEvent;", cancellable = true)
    private static void create_1165919771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165919771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestEvent;", cancellable = true)
    private static void create__217066803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-217066803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWithMinimumDelay(JLjava/lang/Runnable;)Lnet/minecraft/gametest/framework/GameTestEvent;", cancellable = true)
    private static void createWithMinimumDelay_1115365984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115365984L))
            info.setReturnValue(null);
    }


}
