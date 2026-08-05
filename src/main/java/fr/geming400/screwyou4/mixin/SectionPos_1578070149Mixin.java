package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.SectionPos.class)
public class SectionPos_1578070149Mixin {
        @Inject(at = @At("HEAD"), method = "of(III)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of__1471174715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471174715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(J)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of_1854968934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854968934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/Position;)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of_707793502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707793502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of_5910592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(5910592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/ChunkPos;I)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of_957462969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(957462969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/entity/EntityAccess;)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void of_1767450220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1767450220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private void offset_973869193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(973869193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(JIII)J", cancellable = true)
    private static void offset_120479503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(120479503L))
            info.setReturnValue(9174550205493296829L);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_348487256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348487256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(JLnet/minecraft/core/Direction;)J", cancellable = true)
    private static void offset_2041359036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041359036L))
            info.setReturnValue(-8600456847679437663L);
    }

    @Inject(at = @At("HEAD"), method = "x(J)I", cancellable = true)
    private static void x_1919157716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919157716L))
            info.setReturnValue(1398415649);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_756863218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(756863218L))
            info.setReturnValue(-1623114590);
    }

    @Inject(at = @At("HEAD"), method = "z(J)I", cancellable = true)
    private static void z__600802218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-600802218L))
            info.setReturnValue(-1846733674);
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z_814121520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814121520L))
            info.setReturnValue(1531680488);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_785492369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785492369L))
            info.setReturnValue(-1915750917);
    }

    @Inject(at = @At("HEAD"), method = "y(J)I", cancellable = true)
    private static void y__1488305899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1488305899L))
            info.setReturnValue(-121025857);
    }

    @Inject(at = @At("HEAD"), method = "origin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void origin__1287916641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1287916641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunk()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunk__526561380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526561380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLong(III)J", cancellable = true)
    private static void asLong_1618161738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618161738L))
            info.setReturnValue(-5654266680590397842L);
    }

    @Inject(at = @At("HEAD"), method = "asLong(Lnet/minecraft/core/BlockPos;)J", cancellable = true)
    private static void asLong_1955617605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955617605L))
            info.setReturnValue(2478310125700825455L);
    }

    @Inject(at = @At("HEAD"), method = "asLong()J", cancellable = true)
    private void asLong_27319581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27319581L))
            info.setReturnValue(7503133433856950392L);
    }

    @Inject(at = @At("HEAD"), method = "cube(Lnet/minecraft/core/SectionPos;I)Ljava/util/stream/Stream;", cancellable = true)
    private static void cube__925357399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-925357399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosedStream(IIIIII)Ljava/util/stream/Stream;", cancellable = true)
    private static void betweenClosedStream__1072190819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1072190819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockToSectionCoord(D)I", cancellable = true)
    private static void blockToSectionCoord_742517614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742517614L))
            info.setReturnValue(1712502743);
    }

    @Inject(at = @At("HEAD"), method = "blockToSectionCoord(I)I", cancellable = true)
    private static void blockToSectionCoord_747135219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747135219L))
            info.setReturnValue(-1636764389);
    }

    @Inject(at = @At("HEAD"), method = "sectionToBlockCoord(I)I", cancellable = true)
    private static void sectionToBlockCoord_435894435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435894435L))
            info.setReturnValue(-868838670);
    }

    @Inject(at = @At("HEAD"), method = "sectionToBlockCoord(II)I", cancellable = true)
    private static void sectionToBlockCoord_558128826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558128826L))
            info.setReturnValue(65706703);
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void center__124290992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124290992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bottomOf(Lnet/minecraft/world/level/chunk/ChunkAccess;)Lnet/minecraft/core/SectionPos;", cancellable = true)
    private static void bottomOf__689645381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689645381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxBlockX()I", cancellable = true)
    private void maxBlockX_550019035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550019035L))
            info.setReturnValue(-1304472483);
    }

    @Inject(at = @At("HEAD"), method = "minBlockY()I", cancellable = true)
    private void minBlockY_1235564236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235564236L))
            info.setReturnValue(-1743912962);
    }

    @Inject(at = @At("HEAD"), method = "minBlockX()I", cancellable = true)
    private void minBlockX_1206935085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206935085L))
            info.setReturnValue(-1290359945);
    }

    @Inject(at = @At("HEAD"), method = "minBlockZ()I", cancellable = true)
    private void minBlockZ_1264193387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264193387L))
            info.setReturnValue(945187704);
    }

    @Inject(at = @At("HEAD"), method = "maxBlockZ()I", cancellable = true)
    private void maxBlockZ_607277337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607277337L))
            info.setReturnValue(1631515210);
    }

    @Inject(at = @At("HEAD"), method = "maxBlockY()I", cancellable = true)
    private void maxBlockY_578648186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578648186L))
            info.setReturnValue(-1729929488);
    }

    @Inject(at = @At("HEAD"), method = "sectionRelativeX(S)I", cancellable = true)
    private static void sectionRelativeX__218305716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218305716L))
            info.setReturnValue(-1903019839);
    }

    @Inject(at = @At("HEAD"), method = "sectionRelativeZ(S)I", cancellable = true)
    private static void sectionRelativeZ_1556701646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556701646L))
            info.setReturnValue(592500687);
    }

    @Inject(at = @At("HEAD"), method = "sectionRelativeY(S)I", cancellable = true)
    private static void sectionRelativeY_669197965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669197965L))
            info.setReturnValue(1780126514);
    }

    @Inject(at = @At("HEAD"), method = "sectionRelativePos(Lnet/minecraft/core/BlockPos;)S", cancellable = true)
    private static void sectionRelativePos_1837888963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837888963L))
            info.setReturnValue((short) 19861);
    }

    @Inject(at = @At("HEAD"), method = "getZeroNode(II)J", cancellable = true)
    private static void getZeroNode__1298233341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298233341L))
            info.setReturnValue(6374332174545820257L);
    }

    @Inject(at = @At("HEAD"), method = "getZeroNode(J)J", cancellable = true)
    private static void getZeroNode_2039504221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2039504221L))
            info.setReturnValue(5774336586923927898L);
    }

    @Inject(at = @At("HEAD"), method = "sectionToChunk(J)J", cancellable = true)
    private static void sectionToChunk_1124285290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1124285290L))
            info.setReturnValue(-416420062327940475L);
    }

    @Inject(at = @At("HEAD"), method = "relativeToBlockPos(S)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relativeToBlockPos__660637290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-660637290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aroundChunk(Lnet/minecraft/world/level/ChunkPos;III)Ljava/util/stream/Stream;", cancellable = true)
    private static void aroundChunk__1197281410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197281410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativeToBlockZ(S)I", cancellable = true)
    private void relativeToBlockZ_1535233441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535233441L))
            info.setReturnValue(-2122809704);
    }

    @Inject(at = @At("HEAD"), method = "aroundAndAtBlockPos(IIILit/unimi/dsi/fastutil/longs/LongConsumer;)V", cancellable = true)
    private static void aroundAndAtBlockPos__2058430084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2058430084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aroundAndAtBlockPos(Lnet/minecraft/core/BlockPos;Lit/unimi/dsi/fastutil/longs/LongConsumer;)V", cancellable = true)
    private static void aroundAndAtBlockPos__398249161(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-398249161L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aroundAndAtBlockPos(JLit/unimi/dsi/fastutil/longs/LongConsumer;)V", cancellable = true)
    private static void aroundAndAtBlockPos_687358941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(687358941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockToSection(J)J", cancellable = true)
    private static void blockToSection_1867230010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1867230010L))
            info.setReturnValue(9081704274524141862L);
    }

    @Inject(at = @At("HEAD"), method = "posToSectionCoord(D)I", cancellable = true)
    private static void posToSectionCoord_1046097845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1046097845L))
            info.setReturnValue(-389309440);
    }

    @Inject(at = @At("HEAD"), method = "relativeToBlockX(S)I", cancellable = true)
    private void relativeToBlockX__239773921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-239773921L))
            info.setReturnValue(-1417772696);
    }

    @Inject(at = @At("HEAD"), method = "blocksInside()Ljava/util/stream/Stream;", cancellable = true)
    private void blocksInside__1953337577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953337577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativeToBlockY(S)I", cancellable = true)
    private void relativeToBlockY_647729760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(647729760L))
            info.setReturnValue(1248637136);
    }

    @Inject(at = @At("HEAD"), method = "sectionRelative(I)I", cancellable = true)
    private static void sectionRelative_729395180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729395180L))
            info.setReturnValue(-1447845062);
    }


}
