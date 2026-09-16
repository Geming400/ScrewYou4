package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.TransientEntitySectionManager.class)
public class TransientEntitySectionManager_148278809Mixin {
        @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count__939891633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-939891633L))
            info.setReturnValue(-44449193);
    }

    @Inject(at = @At("HEAD"), method = "startTicking(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void startTicking__1995270220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1995270220L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopTicking(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void stopTicking_437001044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(437001044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gatherStats()Ljava/lang/String;", cancellable = true)
    private void gatherStats_1367631365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1367631365L))
            info.setReturnValue("^4\u99EEZh\u0AFB");
    }

    @Inject(at = @At("HEAD"), method = "getEntityGetter()Lnet/minecraft/world/level/entity/LevelEntityGetter;", cancellable = true)
    private void getEntityGetter_1193720392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193720392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/level/entity/EntityAccess;)V", cancellable = true)
    private void addEntity_290119535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(290119535L))
            info.cancel();
    }


}
