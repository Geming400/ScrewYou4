package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ColumnPos.class)
public class ColumnPos_1287249952Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1622205086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1622205086L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_151789480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151789480L))
            info.setReturnValue("w`VswJz_<]M2Q:6]:ዸbs");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1325512197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325512197L))
            info.setReturnValue(210600936);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_1325512197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325512197L))
            info.setReturnValue(210600936);
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z_1325512197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325512197L))
            info.setReturnValue(210600936);
    }

    @Inject(at = @At("HEAD"), method = "toLong()J", cancellable = true)
    private void toLong_1325513158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325513158L))
            info.setReturnValue(4727620349241306150L);
    }

    @Inject(at = @At("HEAD"), method = "getX(J)I", cancellable = true)
    private static void getX__1792889097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792889097L))
            info.setReturnValue(844820935);
    }

    @Inject(at = @At("HEAD"), method = "getZ(J)I", cancellable = true)
    private static void getZ__1792889097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792889097L))
            info.setReturnValue(844820935);
    }

    @Inject(at = @At("HEAD"), method = "toChunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void toChunkPos_398151114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398151114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLong(II)J", cancellable = true)
    private static void asLong_291359198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291359198L))
            info.setReturnValue(5208081262566591127L);
    }


}
