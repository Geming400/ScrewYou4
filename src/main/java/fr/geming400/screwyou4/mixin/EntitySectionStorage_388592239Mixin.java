package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.EntitySectionStorage.class)
public class EntitySectionStorage_388592239Mixin {
        @Inject(at = @At("HEAD"), method = "remove(J)V", cancellable = true)
    private void remove__1736837473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1736837473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count__699578203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-699578203L))
            info.setReturnValue(1223338983);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void getEntities__1780279974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1780279974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void getEntities_1157377812(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1157377812L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSection(J)Lnet/minecraft/world/level/entity/EntitySection;", cancellable = true)
    private void getSection__2006587839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006587839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachAccessibleNonEmptySection(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void forEachAccessibleNonEmptySection_1458419494(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1458419494L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExistingSectionPositionsInChunk(J)Ljava/util/stream/LongStream;", cancellable = true)
    private void getExistingSectionPositionsInChunk_787105667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787105667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllChunksWithExistingSections()Lit/unimi/dsi/fastutil/longs/LongSet;", cancellable = true)
    private void getAllChunksWithExistingSections__1706141111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1706141111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExistingSectionsInChunk(J)Ljava/util/stream/Stream;", cancellable = true)
    private void getExistingSectionsInChunk_1417487382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1417487382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateSection(J)Lnet/minecraft/world/level/entity/EntitySection;", cancellable = true)
    private void getOrCreateSection_770820256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770820256L))
            info.setReturnValue(null);
    }


}
