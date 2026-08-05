package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkStatus.class)
public class ChunkStatus148926961Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__986533510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-986533510L))
            info.setReturnValue("&+e\u4735\uCCE9!\u48F1t(t)J5[,$$Xg*Mv4s[GVmYY9QWXX\u5B238Ll_-K*8*");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__986533510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-986533510L))
            info.setReturnValue("&+e\u4735\uCCE9!\u48F1t(t)J5[,$$Xg*Mv4s[GVmYY9QWXX\u5B238Ll_-K*8*");
    }

    @Inject(at = @At("HEAD"), method = "max(Lnet/minecraft/world/level/chunk/status/ChunkStatus;Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void max_1286374969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286374969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParent()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void getParent_166206559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166206559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIndex()I", cancellable = true)
    private void getIndex_187189207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(187189207L))
            info.setReturnValue(124258417);
    }

    @Inject(at = @At("HEAD"), method = "isAfter(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Z", cancellable = true)
    private void isAfter__1167675497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167675497L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBefore(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Z", cancellable = true)
    private void isBefore__1167675497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167675497L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void byName_1823017229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823017229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightmapsAfter()Ljava/util/EnumSet;", cancellable = true)
    private void heightmapsAfter_1214755572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1214755572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOrAfter(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Z", cancellable = true)
    private void isOrAfter__1167675497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167675497L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isOrBefore(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Z", cancellable = true)
    private void isOrBefore__1167675497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167675497L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getChunkType()Lnet/minecraft/world/level/chunk/status/ChunkType;", cancellable = true)
    private void getChunkType_1733752279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733752279L))
            info.setReturnValue(net.minecraft.world.level.chunk.status.ChunkType.PROTOCHUNK);
    }

    @Inject(at = @At("HEAD"), method = "getStatusList()Ljava/util/List;", cancellable = true)
    private static void getStatusList_1775264025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775264025L))
            info.setReturnValue(null);
    }


}
