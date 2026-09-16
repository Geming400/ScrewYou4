package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidRotation.EulerXYZRotation.class)
public class EulerXYZRotation_1841319580Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_932693311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932693311L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1683224192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683224192L))
            info.setReturnValue("SzFR}\u7867\u548F9\"+\u89C8,j_\u06AB^C4S4;nuGW!g+#rmWC:n<IHY5J$\u1A59-=qif\u364C6\u6D7B4Wp|@K\u3DEAsYy!R<_\u46BAdCw^h\u8651R'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1896295626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1896295626L))
            info.setReturnValue(1311667890);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_1020109766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020109766L))
            info.setReturnValue(1.506745E8F);
    }

    @Inject(at = @At("HEAD"), method = "z()F", cancellable = true)
    private void z_1077368068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077368068L))
            info.setReturnValue(1.506745E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_1048738917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1048738917L))
            info.setReturnValue(1.506745E8F);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Lorg/joml/Matrix4f;", cancellable = true)
    private void transformation_1374088195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1374088195L))
            info.setReturnValue(new org.joml.Matrix4f());
    }


}
