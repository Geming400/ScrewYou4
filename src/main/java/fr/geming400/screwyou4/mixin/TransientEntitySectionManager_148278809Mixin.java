package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.TransientEntitySectionManager.class)
public class TransientEntitySectionManager_148278809Mixin {
        @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_186541054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186541054L))
            info.setReturnValue(-1843259944);
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/level/entity/EntityAccess;)V", cancellable = true)
    private void addEntity_1397669259(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1397669259L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gatherStats()Ljava/lang/String;", cancellable = true)
    private void gatherStats__987181663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987181663L))
            info.setReturnValue("<\u949A5+8M+L}\uFF82]@KBI2Lz$f#9U#yk\u2293%`l[\uACC9\u4146BaH;]");
    }

    @Inject(at = @At("HEAD"), method = "getEntityGetter()Lnet/minecraft/world/level/entity/LevelEntityGetter;", cancellable = true)
    private void getEntityGetter__852967164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852967164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopTicking(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void stopTicking_1663161015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1663161015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTicking(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void startTicking_1663161015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1663161015L))
            info.cancel();
    }


}
