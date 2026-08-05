package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.DynamicUniforms.ChunkSectionInfo.class)
public class ChunkSectionInfo_373728822Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1759241080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759241080L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__761731154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761731154L))
            info.setReturnValue("yI^#izsK@ERqZᘊ>gPN=z;⬪F@@+0m{M>KcwYꆸ1MP]呥<궏<Z(25+nPⓛLꔛ2.4acri䦝i䬠띞_.f'Q9;J넩(\"FqBG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_411991563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411991563L))
            info.setReturnValue(-1129083578);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_411991067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411991067L))
            info.setReturnValue(-925936159);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/nio/ByteBuffer;)V", cancellable = true)
    private void write__237223761(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-237223761L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z_411991067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411991067L))
            info.setReturnValue(-925936159);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_411991067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411991067L))
            info.setReturnValue(-925936159);
    }

    @Inject(at = @At("HEAD"), method = "visibility()F", cancellable = true)
    private void visibility_411988184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411988184L))
            info.setReturnValue(7.543558E8F);
    }

    @Inject(at = @At("HEAD"), method = "textureAtlasWidth()I", cancellable = true)
    private void textureAtlasWidth_411991067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411991067L))
            info.setReturnValue(-925936159);
    }

    @Inject(at = @At("HEAD"), method = "textureAtlasHeight()I", cancellable = true)
    private void textureAtlasHeight_411991067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411991067L))
            info.setReturnValue(-925936159);
    }

    @Inject(at = @At("HEAD"), method = "modelView()Lorg/joml/Matrix4fc;", cancellable = true)
    private void modelView_2116703059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116703059L))
            info.setReturnValue(null);
    }


}
