package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.EntitySectionStorage.class)
public class EntitySectionStorage_388592239Mixin {
        @Inject(at = @At("HEAD"), method = "remove(J)V", cancellable = true)
    private void remove_1603432731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1603432731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_426854484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(426854484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void getEntities__2040164949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2040164949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void getEntities_1839887267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1839887267L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSection(J)Lnet/minecraft/world/level/entity/EntitySection;", cancellable = true)
    private void getSection__615067248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615067248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllChunksWithExistingSections()Lit/unimi/dsi/fastutil/longs/LongSet;", cancellable = true)
    private void getAllChunksWithExistingSections_323706265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323706265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExistingSectionPositionsInChunk(J)Ljava/util/stream/LongStream;", cancellable = true)
    private void getExistingSectionPositionsInChunk__1151764799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1151764799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachAccessibleNonEmptySection(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/util/AbortableIterationConsumer;)V", cancellable = true)
    private void forEachAccessibleNonEmptySection__2040164949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2040164949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOrCreateSection(J)Lnet/minecraft/world/level/entity/EntitySection;", cancellable = true)
    private void getOrCreateSection__615067248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615067248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExistingSectionsInChunk(J)Ljava/util/stream/Stream;", cancellable = true)
    private void getExistingSectionsInChunk__1573815075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573815075L))
            info.setReturnValue(null);
    }


}
