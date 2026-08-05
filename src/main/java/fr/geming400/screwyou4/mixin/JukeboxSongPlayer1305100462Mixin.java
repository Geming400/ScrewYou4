package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.JukeboxSongPlayer.class)
public class JukeboxSongPlayer1305100462Mixin {
        @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void stop__459563910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-459563910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void tick_106717717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(106717717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSong()Lnet/minecraft/world/item/JukeboxSong;", cancellable = true)
    private void getSong_1100451863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100451863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "play(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void play_156967316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(156967316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPlaying()Z", cancellable = true)
    private void isPlaying__81959615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81959615L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSongWithoutPlaying(Lnet/minecraft/core/Holder;J)V", cancellable = true)
    private void setSongWithoutPlaying__707796401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-707796401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicksSinceSongStarted()J", cancellable = true)
    private void getTicksSinceSongStarted_889886371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889886371L))
            info.setReturnValue(-2972626033043460370L);
    }


}
