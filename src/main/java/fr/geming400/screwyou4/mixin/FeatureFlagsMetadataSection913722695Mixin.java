package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.FeatureFlagsMetadataSection.class)
public class FeatureFlagsMetadataSection913722695Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_5096427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(5096427L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1684146220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684146220L))
            info.setReturnValue("\uFB7F^c3V+I,D/h\u1494]Y d_0Ghnk\uC7E9\u6645x_7GiNp/9q4\u4E2D/x6CPa9}E6.%WfV-k*]G");
    }

    @Inject(at = @At("HEAD"), method = "flags()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void flags__262330062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262330062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1471074786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471074786L))
            info.setReturnValue(243714648);
    }


}
