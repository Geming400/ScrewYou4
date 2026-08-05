package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.ItemTransform.class)
public class ItemTransform_2039486757Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1130860488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130860488L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1485057015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485057015L))
            info.setReturnValue("2!\u8604V!Fyc\u5DDBC\u7D28os>E`[T\uD11DHe'O\u62C5R=4s\"5v<Q.jE\uA453F\u3377[m2g\"Tn\u585Aj\u4682RLKO\uCC7E\u156Dd&wCRVuV2{K!nz<'v_\uBB60c\">AZ\u47B03F\u1819F0\u39D5\uD4CA5HHN\u95E6TS(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1698128449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698128449L))
            info.setReturnValue(-868853409);
    }

    @Inject(at = @At("HEAD"), method = "scale()Lorg/joml/Vector3fc;", cancellable = true)
    private void scale__263661329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-263661329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(ZLcom/mojang/blaze3d/vertex/PoseStack$Pose;)V", cancellable = true)
    private void apply_1382177984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1382177984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lorg/joml/Vector3fc;", cancellable = true)
    private void rotation__2130935005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2130935005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translation()Lorg/joml/Vector3fc;", cancellable = true)
    private void translation_798211414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798211414L))
            info.setReturnValue(null);
    }


}
