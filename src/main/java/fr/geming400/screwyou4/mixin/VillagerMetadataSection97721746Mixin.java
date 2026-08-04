package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.animation.VillagerMetadataSection.class)
public class VillagerMetadataSection97721746Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1483234005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483234005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1037738229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037738229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_135984488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135984488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hat()Lnet/minecraft/client/resources/metadata/animation/VillagerMetadataSection$Hat;", cancellable = true)
    private void hat_1633315136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633315136L))
            info.setReturnValue(null);
    }


}
