package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ChunkPos.class)
public class ChunkPos_255280263Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1640792521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640792521L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__880180209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880180209L))
            info.setReturnValue("\u0F4Fp&TsCB\u8C09mO`S{a<v\u998E{lN,*)(Y\uA1D0-MZg@VTvg<^YG0AQ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-347373409);
    }

    @Inject(at = @At("HEAD"), method = "hash(II)I", cancellable = true)
    private static void hash__740611452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740611452L))
            info.setReturnValue(1281405679);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-347373409);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void contains_424050705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424050705L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-347373409);
    }

    @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid_293558845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293558845L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isValid(II)Z", cancellable = true)
    private static void isValid__740595115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740595115L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "rangeClosed(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/ChunkPos;)Ljava/util/stream/Stream;", cancellable = true)
    private static void rangeClosed__977464373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977464373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeClosed(Lnet/minecraft/world/level/ChunkPos;I)Ljava/util/stream/Stream;", cancellable = true)
    private static void rangeClosed__1888260352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1888260352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX(J)I", cancellable = true)
    private static void getX_1470108510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470108510L))
            info.setReturnValue(681761372);
    }

    @Inject(at = @At("HEAD"), method = "getZ(J)I", cancellable = true)
    private static void getZ_1470108510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470108510L))
            info.setReturnValue(681761372);
    }

    @Inject(at = @At("HEAD"), method = "pack(II)J", cancellable = true)
    private static void pack__740610491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740610491L))
            info.setReturnValue(2098382157022255144L);
    }

    @Inject(at = @At("HEAD"), method = "pack()J", cancellable = true)
    private void pack_293543469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293543469L))
            info.setReturnValue(-4474134871918144807L);
    }

    @Inject(at = @At("HEAD"), method = "pack(Lnet/minecraft/core/BlockPos;)J", cancellable = true)
    private static void pack_424035577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424035577L))
            info.setReturnValue(7712284789563336268L);
    }

    @Inject(at = @At("HEAD"), method = "getMinBlockX()I", cancellable = true)
    private void getMinBlockX_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-347373409);
    }

    @Inject(at = @At("HEAD"), method = "getMinBlockZ()I", cancellable = true)
    private void getMinBlockZ_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-347373409);
    }

    @Inject(at = @At("HEAD"), method = "distanceSquared(Lnet/minecraft/world/level/ChunkPos;)I", cancellable = true)
    private void distanceSquared_1770149976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770149976L))
            info.setReturnValue(312992558);
    }

    @Inject(at = @At("HEAD"), method = "distanceSquared(J)I", cancellable = true)
    private void distanceSquared_1470108262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470108262L))
            info.setReturnValue(567875697);
    }

    @Inject(at = @At("HEAD"), method = "getBlockZ(I)I", cancellable = true)
    private void getBlockZ_1469184741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469184741L))
            info.setReturnValue(-604558705);
    }

    @Inject(at = @At("HEAD"), method = "getBlockX(I)I", cancellable = true)
    private void getBlockX_1469184741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469184741L))
            info.setReturnValue(-604558705);
    }

    @Inject(at = @At("HEAD"), method = "containing(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private static void containing__1399710507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1399710507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(J)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private static void unpack_1698261231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698261231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockAt(III)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBlockAt__1024843808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1024843808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRegionLocalX()I", cancellable = true)
    private void getRegionLocalX_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-336859309);
    }

    @Inject(at = @At("HEAD"), method = "fromSectionNode(J)J", cancellable = true)
    private static void fromSectionNode_1470109471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470109471L))
            info.setReturnValue(-54034642759908633L);
    }

    @Inject(at = @At("HEAD"), method = "minFromRegion(II)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private static void minFromRegion_1452363785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452363785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChessboardDistance(II)I", cancellable = true)
    private void getChessboardDistance__740611700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740611700L))
            info.setReturnValue(1584328943);
    }

    @Inject(at = @At("HEAD"), method = "getChessboardDistance(Lnet/minecraft/world/level/ChunkPos;)I", cancellable = true)
    private void getChessboardDistance_1770149976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770149976L))
            info.setReturnValue(323506658);
    }

    @Inject(at = @At("HEAD"), method = "getRegionLocalZ()I", cancellable = true)
    private void getRegionLocalZ_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-336859309);
    }

    @Inject(at = @At("HEAD"), method = "getMiddleBlockPosition(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getMiddleBlockPosition_1679973120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679973120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getWorldPosition__1638106617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638106617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxFromRegion(II)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private static void maxFromRegion_1452363785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452363785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxBlockX()I", cancellable = true)
    private void getMaxBlockX_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-336859309);
    }

    @Inject(at = @At("HEAD"), method = "getMaxBlockZ()I", cancellable = true)
    private void getMaxBlockZ_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-336859309);
    }

    @Inject(at = @At("HEAD"), method = "getRegionZ(J)I", cancellable = true)
    private static void getRegionZ_1470108510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470108510L))
            info.setReturnValue(692275472);
    }

    @Inject(at = @At("HEAD"), method = "getRegionZ()I", cancellable = true)
    private void getRegionZ_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-336859309);
    }

    @Inject(at = @At("HEAD"), method = "getRegionX(J)I", cancellable = true)
    private static void getRegionX_1470108510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470108510L))
            info.setReturnValue(692275472);
    }

    @Inject(at = @At("HEAD"), method = "getRegionX()I", cancellable = true)
    private void getRegionX_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-336859309);
    }

    @Inject(at = @At("HEAD"), method = "getMiddleBlockX()I", cancellable = true)
    private void getMiddleBlockX_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-336859309);
    }

    @Inject(at = @At("HEAD"), method = "getMiddleBlockZ()I", cancellable = true)
    private void getMiddleBlockZ_293542508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293542508L))
            info.setReturnValue(-336859309);
    }


}
