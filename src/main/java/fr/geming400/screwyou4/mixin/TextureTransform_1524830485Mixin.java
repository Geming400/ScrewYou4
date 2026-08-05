package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.TextureTransform.class)
public class TextureTransform_1524830485Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1999713783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999713783L))
            info.setReturnValue("t^2X^iVbVjn}W'c+U\uD2A4\u8F39T\u6942^8Tpt8RT\uB266\u1887jeSq$B3N\u8FBE'et8rKGb U\u17C1VV");
    }

    @Inject(at = @At("HEAD"), method = "createMatrix()Lorg/joml/Matrix4f;", cancellable = true)
    private void createMatrix__811197656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811197656L))
            info.setReturnValue(new org.joml.Matrix4f());
    }


}
