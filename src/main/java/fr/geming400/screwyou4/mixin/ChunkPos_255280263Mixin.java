package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ChunkPos.class)
public class ChunkPos_255280263Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__653346006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653346006L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1025703291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025703291L))
            info.setReturnValue("D#\u371EN*80VC\u8E27\u50E5ct#zA$B2\u83F8\u28DC@NuxjV\u4E79eO&2dQ1o\u83F4\u6F2Ev,)Ha\u26D8u{upU?&;\u4799I\uD02B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_812631857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812631857L))
            info.setReturnValue(-1744932387);
    }

    @Inject(at = @At("HEAD"), method = "hash(II)I", cancellable = true)
    private static void hash__1362117194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362117194L))
            info.setReturnValue(-696605000);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x__565926668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-565926668L))
            info.setReturnValue(1853231557);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void contains__1999262096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999262096L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z__508668366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508668366L))
            info.setReturnValue(1832672942);
    }

    @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid__1966840693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966840693L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isValid(II)Z", cancellable = true)
    private static void isValid_268900643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268900643L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "rangeClosed(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/ChunkPos;)Ljava/util/stream/Stream;", cancellable = true)
    private static void rangeClosed_1828919394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828919394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeClosed(Lnet/minecraft/world/level/ChunkPos;I)Ljava/util/stream/Stream;", cancellable = true)
    private static void rangeClosed__435163703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435163703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX(J)I", cancellable = true)
    private static void getX_1633228192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633228192L))
            info.setReturnValue(2003512254);
    }

    @Inject(at = @At("HEAD"), method = "getZ(J)I", cancellable = true)
    private static void getZ__886731742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886731742L))
            info.setReturnValue(-2096543143);
    }

    @Inject(at = @At("HEAD"), method = "pack()J", cancellable = true)
    private void pack_2002854836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002854836L))
            info.setReturnValue(3909163138782263726L);
    }

    @Inject(at = @At("HEAD"), method = "pack(II)J", cancellable = true)
    private static void pack_1230106124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230106124L))
            info.setReturnValue(153764978677126826L);
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/core/BlockPos;)J", cancellable = true)
    private static void pack_286056658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286056658L))
            info.setReturnValue(4996641008351704628L);
    }

    @Inject(at = @At("HEAD"), method = "containing(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private static void containing_2018681607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018681607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockX(I)I", cancellable = true)
    private void getBlockX_1469210246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469210246L))
            info.setReturnValue(1077555963);
    }

    @Inject(at = @At("HEAD"), method = "getBlockZ(I)I", cancellable = true)
    private void getBlockZ__1050749688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050749688L))
            info.setReturnValue(2052922216);
    }

    @Inject(at = @At("HEAD"), method = "getMaxBlockZ()I", cancellable = true)
    private void getMaxBlockZ__1007554031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007554031L))
            info.setReturnValue(724990809);
    }

    @Inject(at = @At("HEAD"), method = "getMaxBlockX()I", cancellable = true)
    private void getMaxBlockX__1064812333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064812333L))
            info.setReturnValue(1182229777);
    }

    @Inject(at = @At("HEAD"), method = "distanceSquared(Lnet/minecraft/world/level/ChunkPos;)I", cancellable = true)
    private void distanceSquared_1338863462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1338863462L))
            info.setReturnValue(-1840425013);
    }

    @Inject(at = @At("HEAD"), method = "distanceSquared(J)I", cancellable = true)
    private void distanceSquared_373837336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(373837336L))
            info.setReturnValue(1131784848);
    }

    @Inject(at = @At("HEAD"), method = "getMinBlockX()I", cancellable = true)
    private void getMinBlockX__407896283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407896283L))
            info.setReturnValue(1203631080);
    }

    @Inject(at = @At("HEAD"), method = "getMinBlockZ()I", cancellable = true)
    private void getMinBlockZ__350637981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350637981L))
            info.setReturnValue(-106534674);
    }

    @Inject(at = @At("HEAD"), method = "unpack(J)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private static void unpack_149933309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149933309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRegionX()I", cancellable = true)
    private void getRegionX_320881534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320881534L))
            info.setReturnValue(-1524781259);
    }

    @Inject(at = @At("HEAD"), method = "getRegionX(J)I", cancellable = true)
    private static void getRegionX__1977348980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977348980L))
            info.setReturnValue(-476000962);
    }

    @Inject(at = @At("HEAD"), method = "getRegionZ(J)I", cancellable = true)
    private static void getRegionZ__202341618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202341618L))
            info.setReturnValue(-173632334);
    }

    @Inject(at = @At("HEAD"), method = "getRegionZ()I", cancellable = true)
    private void getRegionZ_378139836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378139836L))
            info.setReturnValue(-123321380);
    }

    @Inject(at = @At("HEAD"), method = "getMiddleBlockX()I", cancellable = true)
    private void getMiddleBlockX__660083114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-660083114L))
            info.setReturnValue(-1457298693);
    }

    @Inject(at = @At("HEAD"), method = "getMiddleBlockZ()I", cancellable = true)
    private void getMiddleBlockZ__602824812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-602824812L))
            info.setReturnValue(-1845236658);
    }

    @Inject(at = @At("HEAD"), method = "getChessboardDistance(Lnet/minecraft/world/level/ChunkPos;)I", cancellable = true)
    private void getChessboardDistance_1292650375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292650375L))
            info.setReturnValue(1356694293);
    }

    @Inject(at = @At("HEAD"), method = "getChessboardDistance(II)I", cancellable = true)
    private void getChessboardDistance__1243310981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1243310981L))
            info.setReturnValue(897643680);
    }

    @Inject(at = @At("HEAD"), method = "minFromRegion(II)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private static void minFromRegion_1963842361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963842361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxFromRegion(II)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private static void maxFromRegion_679269707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679269707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getWorldPosition_1387925378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387925378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMiddleBlockPosition(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getMiddleBlockPosition_368519755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(368519755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRegionLocalX()I", cancellable = true)
    private void getRegionLocalX__1927619595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927619595L))
            info.setReturnValue(200875662);
    }

    @Inject(at = @At("HEAD"), method = "fromSectionNode(J)J", cancellable = true)
    private static void fromSectionNode__293949988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293949988L))
            info.setReturnValue(6905141016643945063L);
    }

    @Inject(at = @At("HEAD"), method = "getRegionLocalZ()I", cancellable = true)
    private void getRegionLocalZ__1870361293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1870361293L))
            info.setReturnValue(-790984688);
    }

    @Inject(at = @At("HEAD"), method = "getBlockAt(III)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBlockAt_999640138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999640138L))
            info.setReturnValue(null);
    }


}
