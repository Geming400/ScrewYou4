package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.JukeboxSongPlayer.class)
public class JukeboxSongPlayer1305100462Mixin {
        @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void stop__749261704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-749261704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void tick__749261704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-749261704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicksSinceSongStarted()J", cancellable = true)
    private void getTicksSinceSongStarted_1343363669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343363669L))
            info.setReturnValue(-2326095142400016295L);
    }

    @Inject(at = @At("HEAD"), method = "setSongWithoutPlaying(Lnet/minecraft/core/Holder;J)V", cancellable = true)
    private void setSongWithoutPlaying_2029513068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2029513068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSong()Lnet/minecraft/world/item/JukeboxSong;", cancellable = true)
    private void getSong_1016025164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016025164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "play(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void play__1193758136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1193758136L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPlaying()Z", cancellable = true)
    private void isPlaying_1343379045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343379045L))
            info.setReturnValue(false);
    }


}
