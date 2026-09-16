package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.FileMove.class)
public class FileMove_1259676707Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_351050438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351050438L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2030100231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030100231L))
            info.setReturnValue("\uCDFC*'^v:\u6058'e!qRxDy9:Ec?};G^k\u456Fdjh60");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1817028797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817028797L))
            info.setReturnValue(1244933609);
    }

    @Inject(at = @At("HEAD"), method = "from()Ljava/nio/file/Path;", cancellable = true)
    private void from__1767482966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767482966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "to()Ljava/nio/file/Path;", cancellable = true)
    private void to_786640251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(786640251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveCodec(Ljava/nio/file/Path;Ljava/nio/file/Path;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void moveCodec__1108608089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1108608089L))
            info.setReturnValue(null);
    }


}
