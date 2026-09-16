package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.PersistentEntitySectionManager.class)
public class PersistentEntitySectionManager1235239418Mixin {
        @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_147068977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(147068977L))
            info.setReturnValue(991668390);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__879336011(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-879336011L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLoaded(Ljava/util/UUID;)Z", cancellable = true)
    private void isLoaded_2113853206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113853206L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1105555760(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1105555760L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTicking(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void isTicking_2082599778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082599778L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "saveAll()V", cancellable = true)
    private void saveAll__1378876343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1378876343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "autoSave()V", cancellable = true)
    private void autoSave_271721569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(271721569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityGetter()Lnet/minecraft/world/level/entity/LevelEntityGetter;", cancellable = true)
    private void getEntityGetter__2014286294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2014286294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpSections(Ljava/io/Writer;)V", cancellable = true)
    private void dumpSections__35053557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-35053557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLegacyChunkEntities(Ljava/util/stream/Stream;)V", cancellable = true)
    private void addLegacyChunkEntities__660400231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-660400231L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addWorldGenChunkEntities(Ljava/util/stream/Stream;)V", cancellable = true)
    private void addWorldGenChunkEntities__2026091996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2026091996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "areEntitiesLoaded(J)Z", cancellable = true)
    private void areEntitiesLoaded__821762363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821762363L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canPositionTick(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void canPositionTick_86372359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86372359L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canPositionTick(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void canPositionTick_993240667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993240667L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "processPendingLoads()V", cancellable = true)
    private void processPendingLoads__1940448568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1940448568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addNewEntity(Lnet/minecraft/world/level/entity/EntityAccess;)Z", cancellable = true)
    private void addNewEntity__1374588557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1374588557L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "gatherStats()Ljava/lang/String;", cancellable = true)
    private void gatherStats__1840375321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840375321L))
            info.setReturnValue("\u1ACD|=fN.An\u9517\u5BCD");
    }

    @Inject(at = @At("HEAD"), method = "updateChunkStatus(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/server/level/FullChunkStatus;)V", cancellable = true)
    private void updateChunkStatus__1043259099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1043259099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateChunkStatus(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/entity/Visibility;)V", cancellable = true)
    private void updateChunkStatus__2050803028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2050803028L))
            info.cancel();
    }


}
