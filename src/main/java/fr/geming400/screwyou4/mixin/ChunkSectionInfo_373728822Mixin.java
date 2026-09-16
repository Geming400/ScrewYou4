package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.DynamicUniforms.ChunkSectionInfo.class)
public class ChunkSectionInfo_373728822Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__534897447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-534897447L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1144152346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144152346L))
            info.setReturnValue(" \uA01A@)u7DW)yB\uAF51tE?@Zl\u6E84=p\" h]\u86C1<xQ*z+:nKY)PK=[g`Q+fS{ALuN.QKa+F'Ci=#b{G\u16AB\"&yt\uFA763");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_931080912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931080912L))
            info.setReturnValue(-252943549);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x__447478109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447478109L))
            info.setReturnValue(-1280644416);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/nio/ByteBuffer;)V", cancellable = true)
    private void write__1536331826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1536331826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z__390219807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-390219807L))
            info.setReturnValue(416302619);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y__418848958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418848958L))
            info.setReturnValue(1384360968);
    }

    @Inject(at = @At("HEAD"), method = "textureAtlasWidth()I", cancellable = true)
    private void textureAtlasWidth_868078181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868078181L))
            info.setReturnValue(-1427150630);
    }

    @Inject(at = @At("HEAD"), method = "textureAtlasHeight()I", cancellable = true)
    private void textureAtlasHeight_1033288964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033288964L))
            info.setReturnValue(84909357);
    }

    @Inject(at = @At("HEAD"), method = "modelView()Lorg/joml/Matrix4fc;", cancellable = true)
    private void modelView__1839376703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839376703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visibility()F", cancellable = true)
    private void visibility__1793775354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1793775354L))
            info.setReturnValue(5.211098E8F);
    }


}
