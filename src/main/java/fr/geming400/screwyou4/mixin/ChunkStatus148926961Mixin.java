package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkStatus.class)
public class ChunkStatus148926961Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1739919941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739919941L))
            info.setReturnValue("rrm3q2\u4268-VjoZt]6EudBXLvB,KF\uAD52L{KG|f^gIJzJGdo\uB4DAK\u601CGOt");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_919349990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919349990L))
            info.setReturnValue("%`8yxBBK:\u8F53<:4Y$4$(+!\u525EiZq,VcK; <%wioySh5CN4jDK\u9E0B0\u030Er\u5C0C;\u955B/HrN1l*\u875AL\u3646M9D j9Ycx+pPGkiA=5.Qc5\u57D9ufpw");
    }

    @Inject(at = @At("HEAD"), method = "max(Lnet/minecraft/world/level/chunk/status/ChunkStatus;Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void max__1385866339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385866339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParent()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void getParent_1605560319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605560319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIndex()I", cancellable = true)
    private void getIndex_545294907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545294907L))
            info.setReturnValue(765711495);
    }

    @Inject(at = @At("HEAD"), method = "isAfter(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Z", cancellable = true)
    private void isAfter__77056763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-77056763L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBefore(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Z", cancellable = true)
    private void isBefore__1675086226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1675086226L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void byName_979564047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979564047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightmapsAfter()Ljava/util/EnumSet;", cancellable = true)
    private void heightmapsAfter_1908468982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908468982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOrAfter(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Z", cancellable = true)
    private void isOrAfter__1400895160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1400895160L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOrBefore(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Z", cancellable = true)
    private void isOrBefore_235596427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235596427L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStatusList()Ljava/util/List;", cancellable = true)
    private static void getStatusList_74806719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(74806719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkType()Lnet/minecraft/world/level/chunk/status/ChunkType;", cancellable = true)
    private void getChunkType__1458448472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458448472L))
            info.setReturnValue(net.minecraft.world.level.chunk.status.ChunkType.PROTOCHUNK);
    }


}
