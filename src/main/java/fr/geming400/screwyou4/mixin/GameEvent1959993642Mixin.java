package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.GameEvent.class)
public class GameEvent1959993642Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1051367374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051367374L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1564550129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564550129L))
            info.setReturnValue("D:]-?bB|$lqZZ!>:Q{\u6D97");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1777621563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777621563L))
            info.setReturnValue(97137248);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap__889074710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889074710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notificationRadius()I", cancellable = true)
    private void notificationRadius_1810924499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1810924499L))
            info.setReturnValue(-857288836);
    }


}
