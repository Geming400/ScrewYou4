package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.GameEventListener.DeliveryMode.class)
public class DeliveryMode_1768831419Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/gameevent/GameEventListener$DeliveryMode;", cancellable = true)
    private static void values__1915285897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915285897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/gameevent/GameEventListener$DeliveryMode;", cancellable = true)
    private static void valueOf__1116340620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116340620L))
            info.setReturnValue(net.minecraft.world.level.gameevent.GameEventListener.DeliveryMode.BY_DISTANCE);
    }


}
