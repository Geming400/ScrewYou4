package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.SectionPos.class)
public class SectionPos_1578070149Mixin {
        @Inject(at = @At("HEAD"), method = "of(III)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of__873352402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873352402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(J)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of_1725982223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725982223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/Position;)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of_625622151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625622151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of__76260759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-76260759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/ChunkPos;I)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of_1935125218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935125218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/entity/EntityAccess;)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of_1984329813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984329813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private void offset__873352650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873352650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(JIII)J", cancellable = true)
    private static void offset_640241218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(640241218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__750599029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-750599029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(JLnet/minecraft/core/Direction;)J", cancellable = true)
    private static void offset__302459991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302459991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x(J)I", cancellable = true)
    private static void x__1502068900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502068900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_1616332394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616332394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z(J)I", cancellable = true)
    private static void z__1502068900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502068900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z_1616332394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616332394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_1616332394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616332394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y(J)I", cancellable = true)
    private static void y__1502068900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502068900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "origin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void origin__315316731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315316731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunk()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunk_688971311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688971311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockToSectionCoord(D)I", cancellable = true)
    private static void blockToSectionCoord__1507610026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507610026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockToSectionCoord(I)I", cancellable = true)
    private static void blockToSectionCoord__1502992421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502992421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionToBlockCoord(II)I", cancellable = true)
    private static void sectionToBlockCoord_582178434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582178434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionToBlockCoord(I)I", cancellable = true)
    private static void sectionToBlockCoord__1502992421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502992421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosedStream(IIIIII)Ljava/util/stream/Stream;", cancellable = true)
    private static void betweenClosedStream_77498193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77498193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZeroNode(J)J", cancellable = true)
    private static void getZeroNode__1502067939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502067939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZeroNode(II)J", cancellable = true)
    private static void getZeroNode_582179395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582179395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxBlockX()I", cancellable = true)
    private void maxBlockX_1616332394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616332394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minBlockX()I", cancellable = true)
    private void minBlockX_1616332394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616332394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxBlockY()I", cancellable = true)
    private void maxBlockY_1616332394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616332394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minBlockY()I", cancellable = true)
    private void minBlockY_1616332394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616332394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minBlockZ()I", cancellable = true)
    private void minBlockZ_1616332394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616332394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxBlockZ()I", cancellable = true)
    private void maxBlockZ_1616332394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616332394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cube(Lnet/minecraft/core/SectionPos;I)Ljava/util/stream/Stream;", cancellable = true)
    private static void cube_1004753598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004753598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLong()J", cancellable = true)
    private void asLong_1616333355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616333355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLong(Lnet/minecraft/core/BlockPos;)J", cancellable = true)
    private static void asLong_1746825463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746825463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLong(III)J", cancellable = true)
    private static void asLong_797966460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797966460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void center__315316731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315316731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionRelative(I)I", cancellable = true)
    private static void sectionRelative__1502992421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502992421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockToSection(J)J", cancellable = true)
    private static void blockToSection__1502067939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502067939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bottomOf(Lnet/minecraft/world/level/chunk/ChunkAccess;)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void bottomOf__21747879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21747879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionRelativeX(S)I", cancellable = true)
    private static void sectionRelativeX__1493757211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493757211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativeToBlockX(S)I", cancellable = true)
    private void relativeToBlockX__1493757459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493757459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativeToBlockZ(S)I", cancellable = true)
    private void relativeToBlockZ__1493757459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493757459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionRelativePos(Lnet/minecraft/core/BlockPos;)S", cancellable = true)
    private static void sectionRelativePos_1746834112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746834112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blocksInside()Ljava/util/stream/Stream;", cancellable = true)
    private void blocksInside_1367363833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1367363833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aroundChunk(Lnet/minecraft/world/level/ChunkPos;III)Ljava/util/stream/Stream;", cancellable = true)
    private static void aroundChunk__1585038626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1585038626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionRelativeY(S)I", cancellable = true)
    private static void sectionRelativeY__1493757211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493757211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativeToBlockY(S)I", cancellable = true)
    private void relativeToBlockY__1493757459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493757459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "posToSectionCoord(D)I", cancellable = true)
    private static void posToSectionCoord__1507610026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507610026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionRelativeZ(S)I", cancellable = true)
    private static void sectionRelativeZ__1493757211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493757211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aroundAndAtBlockPos(IIILit/unimi/dsi/fastutil/longs/LongConsumer;)V", cancellable = true)
    private static void aroundAndAtBlockPos_1712857656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1712857656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aroundAndAtBlockPos(JLit/unimi/dsi/fastutil/longs/LongConsumer;)V", cancellable = true)
    private static void aroundAndAtBlockPos__944469095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-944469095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aroundAndAtBlockPos(Lnet/minecraft/core/BlockPos;Lit/unimi/dsi/fastutil/longs/LongConsumer;)V", cancellable = true)
    private static void aroundAndAtBlockPos__737490701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-737490701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "relativeToBlockPos(S)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relativeToBlockPos__1654137080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654137080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionToChunk(J)J", cancellable = true)
    private static void sectionToChunk__1502067939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502067939L))
            info.setReturnValue(null);
    }


}
