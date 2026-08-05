package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.ShadowFeatureRenderer.Submit.class)
public class Submit_1162854479Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1746600559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746600559L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_27394503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27394503L))
            info.setReturnValue("CK\u7582{/hl]KIbU1w 6b\uC74C^SEt?\u4462rvk_{.p*OUr;%#0#I9MY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1201117220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201117220L))
            info.setReturnValue(1103578266);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType__2101029292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101029292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radius()F", cancellable = true)
    private void radius_1201113841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201113841L))
            info.setReturnValue(7.166521E8F);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix4fc;", cancellable = true)
    private void pose__1389138580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389138580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pieces()Ljava/util/List;", cancellable = true)
    private void pieces__1505776002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1505776002L))
            info.setReturnValue(null);
    }


}
