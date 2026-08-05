package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.virtualfilesystem.FileMove.class)
public class FileMove_1259676707Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1649778331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649778331L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_124216731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124216731L))
            info.setReturnValue("A*|K賰St<B>:*Or\"읐<|JoB蹷pn2GGrK&}:됖p䜸劶㾒$Fl+A>b/Rᜅ@+,쎕;ኈG]).︡㲜V=im,㔚sui");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1297939448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297939448L))
            info.setReturnValue(-1704768948);
    }

    @Inject(at = @At("HEAD"), method = "from()Ljava/nio/file/Path;", cancellable = true)
    private void from_125313024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(125313024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "to()Ljava/nio/file/Path;", cancellable = true)
    private void to_125313024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(125313024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveCodec(Ljava/nio/file/Path;Ljava/nio/file/Path;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void moveCodec__1580268446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1580268446L))
            info.setReturnValue(null);
    }


}
