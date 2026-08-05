package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.EnchantmentsPredicate.Enchantments.class)
public class Enchantments410735271Mixin {
        @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType_2127249805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127249805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__1057402073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057402073L))
            info.setReturnValue(true);
    }


}
