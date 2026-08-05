package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.EnchantmentsPredicate.StoredEnchantments.class)
public class StoredEnchantments_673983638Mixin {
        @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType_1942302500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942302500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches_2059624360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059624360L))
            info.setReturnValue(false);
    }


}
