package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.DynamicGameEventListener.class)
public class DynamicGameEventListener_1358341013Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void remove__1317905900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1317905900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void add_1389815063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1389815063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void move_1167101927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1167101927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/GameEventListener;", cancellable = true)
    private void getListener_1857446005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1857446005L))
            info.setReturnValue(null);
    }


}
