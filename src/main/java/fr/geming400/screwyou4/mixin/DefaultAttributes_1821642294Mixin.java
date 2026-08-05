package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.DefaultAttributes.class)
public class DefaultAttributes_1821642294Mixin {
        @Inject(at = @At("HEAD"), method = "validate()V", cancellable = true)
    private static void validate_937769610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(937769610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSupplier(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier;", cancellable = true)
    private static void getSupplier_968294014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968294014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSupplier(Lnet/minecraft/world/entity/EntityType;)Z", cancellable = true)
    private static void hasSupplier_1515376681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515376681L))
            info.setReturnValue(false);
    }


}
