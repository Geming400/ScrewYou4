package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.TextureTransform.class)
public class TextureTransform_1524830485Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_389370013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389370013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMatrix()Lorg/joml/Matrix4f;", cancellable = true)
    private void createMatrix_57023397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57023397L))
            info.setReturnValue(null);
    }


}
