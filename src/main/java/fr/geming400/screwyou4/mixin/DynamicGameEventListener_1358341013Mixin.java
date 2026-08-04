package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.DynamicGameEventListener.class)
public class DynamicGameEventListener_1358341013Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void remove_379931672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(379931672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void add_379931672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(379931672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void move_379931672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(379931672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/GameEventListener;", cancellable = true)
    private void getListener_1895253215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895253215L))
            info.setReturnValue(null);
    }


}
